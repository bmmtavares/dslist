package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

// Camada de Acesso a Dados
public interface GameListRepository extends JpaRepository<GameList, Long> {

}