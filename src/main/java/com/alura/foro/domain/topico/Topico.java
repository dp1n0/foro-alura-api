package com.alura.foro.domain.topico;

import java.time.LocalDateTime;

import com.alura.foro.domain.curso.Curso;
import com.alura.foro.domain.usuario.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	
	private String mensaje;
	
	private LocalDateTime fechaCreacion;
	
	@Enumerated(EnumType.STRING)
	private StatusTopico status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "autor_id")
	private Usuario autor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "curso_id")
	private Curso curso;
	
	private Boolean activo;

	public Topico(String titulo, String mensaje,Usuario autor, Curso curso) {
		this.fechaCreacion = LocalDateTime.now();
		this.status = StatusTopico.NO_RESPONDIDO;
		this.activo = true;
		this.titulo = titulo;
		this.mensaje = mensaje;
		this.autor = autor;
		this.curso = curso;
	}

	public void actualizarDatos(String titulo, String mensaje, Usuario usuario, Curso curso) {
		if(titulo != null) {
			this.titulo = titulo;
		}
		if(mensaje != null) {
			this.mensaje = mensaje;
		}
		if(usuario != null) {
			this.autor = usuario;
		}
		if(curso != null) {
			this.curso = curso;
		}
	}

	public void desactivar() {
		this.activo = false;
	}
}
