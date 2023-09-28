package com.alura.foro.domain.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String email;
	
	private Boolean activo;
	
	// private String contraseña;

	public Usuario(DatosUsuario usuario) {
		this.id = usuario.id();
		this.nombre = usuario.nombre();
		this.email = usuario.email();
	}

	public Usuario(String email, String nombre) {
		this.activo = true;
		this.email = email;
		this.nombre = nombre;
	}

	public void actualizar(String nombre, String email) {
		if(nombre != null) {
			this.nombre = nombre;
		}
		if(email != null) {
			this.email = email;
		}
	}

	public void desactivarUsuario() {
		this.activo = false;
	}
}
