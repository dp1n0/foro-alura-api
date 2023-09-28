package com.alura.foro.domain.topico;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.UniqueElements;

public record DatosRegistrarTopico(
		Long id,
		@NotNull
		String titulo,
		@NotNull
		String mensaje,
		@NotNull
		Long idAutor,
		@NotNull
		Long idCurso
		) {

}
