package com.alura.foro.controller;

import com.alura.foro.domain.topico.*;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.alura.foro.domain.service.TopicoService;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/topicos")
@SecurityRequirement(name = "bearer-key")
public class TopicoController {
	
	@Autowired
	private TopicoService service;

	@PostMapping
	@Transactional
	public ResponseEntity<DatosDetalleTopico> registrar(@RequestBody @Valid
			DatosRegistrarTopico datos, UriComponentsBuilder uriComponentsBuilder) {
		
		var topico = service.registrar(datos);

		URI url = uriComponentsBuilder.path("topicos/{id}").
				buildAndExpand(topico.id()).toUri();
		
		return ResponseEntity.ok(topico);
	}

	@GetMapping
	public ResponseEntity<List<DatosTopico>> consultar() {
		var topico = service.consultar();
		return ResponseEntity.ok(topico);
	}

	@GetMapping("/{id}")
	public ResponseEntity<DatosTopico> consultarTopico(@PathVariable Long id) {
		Topico topico = service.consultarTopico(id);
		return ResponseEntity.ok(new DatosTopico(topico));
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<DatosDetalleTopico> actualizarTopico(@PathVariable Long id,
										   @RequestBody @Valid DatosActualizarTopico datosActualizarTopico) {
		Topico topico = service.actualizar(id, datosActualizarTopico);

		return ResponseEntity.ok(new DatosDetalleTopico(topico));
	}

	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity eliminarTopico(@PathVariable Long id) {
		service.desactivarTopico(id);
		return ResponseEntity.noContent().build();
	}

//	@GetMapping
//	public ResponseEntity<Page<DatosTopico>> consultar(
//			@PageableDefault(page=0, size=2) Pageable pageable
//	) {
////		var topico = service.consultar();
////		return ResponseEntity.ok(topico);
//		return ResponseEntity.ok(repository.findByActivoTrue(pageable).map(
//				DatosTopico::new));
//
//	}

}
