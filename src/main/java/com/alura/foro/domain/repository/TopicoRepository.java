package com.alura.foro.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alura.foro.domain.topico.Topico;

import java.util.List;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long>{

    List<Topico> findByActivoTrue();
}
