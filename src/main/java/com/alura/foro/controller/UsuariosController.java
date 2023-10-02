package com.alura.foro.controller;

import com.alura.foro.domain.usuario.DatosActualizarUsuario;
import com.alura.foro.domain.usuario.DatosRegistrarUsuario;
import com.alura.foro.domain.usuario.DatosUsuario;
import com.alura.foro.domain.usuario.Usuario;
import com.alura.foro.domain.service.UsuarioService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@SecurityRequirement(name = "bearer-key")
public class UsuariosController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<DatosUsuario>> consultar() {
        List<DatosUsuario> usuario = service.consultar();
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosUsuario> consultarUsuario(@PathVariable Long id) {
        Usuario usuario = service.consultarUsuario(id);
        return ResponseEntity.ok(new DatosUsuario(usuario));
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DatosUsuario> registrar(@RequestBody @Valid DatosRegistrarUsuario datos) {
        DatosUsuario usuario = service.regisrar(datos);
        return ResponseEntity.ok(usuario);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<DatosUsuario> actualizarUsuario(@PathVariable Long id,
                                                          @RequestBody @Valid DatosActualizarUsuario datos) {
        Usuario usuario = service.actualizarUsuario(id, datos);
        return ResponseEntity.ok(new DatosUsuario(usuario));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminarUsuario(@PathVariable Long id) {
        service.desactivarUsuario(id);
        return ResponseEntity.noContent().build();
    }
}
