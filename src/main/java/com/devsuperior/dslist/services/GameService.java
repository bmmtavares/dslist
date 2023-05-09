package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

// Regra de Negocios

@Service
public class GameService {

	// injetando, dependencia com bd
	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
		// var result = gameRepository.findAll();
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto=result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
