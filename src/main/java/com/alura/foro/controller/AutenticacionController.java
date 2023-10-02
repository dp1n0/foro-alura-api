package com.alura.foro.controller;

import com.alura.foro.domain.autenticacion.Autenticacion;
import com.alura.foro.domain.autenticacion.DatosAutenticacion;
import com.alura.foro.infra.security.DatosJWTToken;
import com.alura.foro.infra.security.TokenService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@SecurityRequirement(name = "bearer-key")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacion datosAutenticacion) {
        Authentication token = new UsernamePasswordAuthenticationToken(
                datosAutenticacion.login(),
                datosAutenticacion.clave()
        );
        var usuarioAutenticado = authenticationManager.authenticate(token);
        var JWTToken = tokenService.generarToken((Autenticacion) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(JWTToken));
    }
}
