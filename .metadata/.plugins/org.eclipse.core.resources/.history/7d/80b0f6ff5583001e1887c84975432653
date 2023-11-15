package com.cursodeve.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursodeve.dslist.Entites.Game;
import com.cursodeve.dslist.dto.GameMinDTO;
import com.cursodeve.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		//Transformando a lista game, para lista gamedto com os atributos da dto.
	    List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
}
