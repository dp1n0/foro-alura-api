package com.alura.foro.domain.topico;

public record DatosDetalleTopico(
		Long id,
		String titulo,
		String mensaje,
		StatusTopico status,
		Long idAutor,
		Long idCurso
		) {
	
	public DatosDetalleTopico(Topico topico) {
		this(
				topico.getId(),
				topico.getTitulo(),
				topico.getMensaje(),
				topico.getStatus(),
				topico.getAutor().getId(),
				topico.getCurso().getId()
				);
	}

}
