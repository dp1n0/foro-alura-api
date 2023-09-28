package com.alura.foro.domain.usuario;

import jakarta.validation.constraints.Email;

public record DatosActualizarUsuario(
        Long id,
        String nombre,
        @Email
        String email
) {

}
