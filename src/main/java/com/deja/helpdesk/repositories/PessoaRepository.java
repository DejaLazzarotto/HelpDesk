package com.deja.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deja.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
