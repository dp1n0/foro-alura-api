package com.alura.foro.domain.repository;

import com.alura.foro.domain.autenticacion.Autenticacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface AutenticacionRepository extends JpaRepository<Autenticacion, Long> {

    UserDetails findByLogin(String username);
}
