package com.deja.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deja.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
