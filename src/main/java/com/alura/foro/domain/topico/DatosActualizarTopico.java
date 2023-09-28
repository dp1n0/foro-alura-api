package com.alura.foro.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
		Long id,
		String titulo,
		String mensaje,
		Long idAutor,
		Long idCurso
		) {

}
