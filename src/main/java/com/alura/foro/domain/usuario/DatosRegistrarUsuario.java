package com.alura.foro.domain.usuario;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record DatosRegistrarUsuario(
        Long id,
        @NotNull
        String nombre,
        @NotNull @Email
        String email
) {

}
