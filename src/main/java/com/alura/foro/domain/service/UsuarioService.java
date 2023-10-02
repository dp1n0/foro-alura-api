package com.alura.foro.domain.service;

import com.alura.foro.domain.repository.UsuarioRepository;
import com.alura.foro.domain.usuario.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<DatosUsuario> consultar() {
        return usuarioRepository.findByActivoTrue().stream().map(DatosUsuario::new).toList();
    }

    public Usuario consultarUsuario(Long id) {
        Usuario usuario = usuarioRepository.getReferenceById(id);
        return usuario;
    }

    public DatosUsuario regisrar(DatosRegistrarUsuario datos) {
        Usuario usuario = new Usuario(datos.email(), datos.nombre());
        usuarioRepository.save(usuario);

        return new DatosUsuario(usuario);
    }

    public Usuario actualizarUsuario(Long id, DatosActualizarUsuario datos) {
        Usuario usuario = usuarioRepository.getReferenceById(id);
        usuario.actualizar(datos.nombre(), datos.email());
        return usuario;
    }

    public void desactivarUsuario(Long id) {
        Usuario usuario = usuarioRepository.getReferenceById(id);
        usuario.desactivarUsuario();
    }
}
