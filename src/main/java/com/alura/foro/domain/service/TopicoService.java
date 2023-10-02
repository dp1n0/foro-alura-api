package com.alura.foro.domain.service;

import com.alura.foro.domain.repository.CursoRepository;
import com.alura.foro.domain.curso.Curso;
import com.alura.foro.domain.topico.*;
import com.alura.foro.domain.usuario.Usuario;
import com.alura.foro.domain.repository.UsuarioRepository;
import com.alura.foro.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alura.foro.domain.repository.TopicoRepository;

import java.util.List;

@Service
public class TopicoService {
	
	@Autowired
	private TopicoRepository topicoRepositoryository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private CursoRepository cursoRepository;
	
	public DatosDetalleTopico registrar(DatosRegistrarTopico datos) {

		if (!usuarioRepository.findById(datos.idAutor()).isPresent()) {
			throw new ValidacionDeIntegridad("Este ID de autor no fue encontrado.");
		}

		if (!cursoRepository.findById(datos.idCurso()).isPresent()) {
			throw new ValidacionDeIntegridad("Este ID de autor no fue encontrado.");
		}

		Usuario usuario = usuarioRepository.findById(datos.idAutor()).get();
		Curso curso = cursoRepository.findById(datos.idCurso()).get();

		var topico = new Topico(datos.titulo(), datos.mensaje(), usuario, curso);
		topicoRepositoryository.save(topico);

		return new DatosDetalleTopico(topico);
	}

	public List<DatosTopico> consultar() {
		return topicoRepositoryository.findByActivoTrue().stream().map(DatosTopico::new).toList();
	}

	public Topico consultarTopico(Long id) {
		Topico topico = topicoRepositoryository.getReferenceById(id);
		return topico;
	}

	public Topico actualizar(Long id, DatosActualizarTopico datos) {
		Topico topico = topicoRepositoryository.getReferenceById(id);
		Usuario usuario;
		Curso curso;

		if(datos.idAutor() != null) {
			usuario = usuarioRepository.findById(datos.idAutor()).get();
		} else {
			usuario = topico.getAutor();
		}

		if(datos.idCurso() != null) {
			curso = cursoRepository.findById(datos.idCurso()).get();
		} else {
			curso = topico.getCurso();
		}

		topico.actualizarDatos(datos.titulo(), datos.mensaje(), usuario, curso);
		return topico;
	}

	public void desactivarTopico(Long id) {
		Topico topico = topicoRepositoryository.getReferenceById(id);
		topico.desactivar();
	}
}
