package com.cursodeve.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursodeve.dslist.Entites.Game;
import com.cursodeve.dslist.dto.GameDTO;
import com.cursodeve.dslist.dto.GameMinDTO;
import com.cursodeve.dslist.projections.GameMinProjection;
import com.cursodeve.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long gameid) {
		Game result = gameRepository.findById(gameid).get();//recebe id e return obj
		GameDTO dto  = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		//Transformando a lista game, para lista gamedto com os atributos da dto.
	    List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		//Transformando a lista game, para lista gamedto com os atributos da dto.
	    return  result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}

	
	
}
