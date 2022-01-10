package com.deja.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deja.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}