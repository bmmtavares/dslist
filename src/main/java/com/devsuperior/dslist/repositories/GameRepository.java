package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

// Camada de Acesso a Dados
public interface GameRepository extends JpaRepository<Game, Long> {

}
