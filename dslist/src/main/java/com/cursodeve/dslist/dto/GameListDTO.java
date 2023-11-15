package com.cursodeve.dslist.dto;

import com.cursodeve.dslist.Entites.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	public GameListDTO(){
		
	}

	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
