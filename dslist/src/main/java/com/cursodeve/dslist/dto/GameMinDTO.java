package com.cursodeve.dslist.dto;

import com.cursodeve.dslist.Entites.Game;

public class GameMinDTO {

	
	private long id;
	private String title;
	private int year;
	private String imgUrl;
	private String shortDescription;
	
	 public GameMinDTO() {
	 }

	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	 
	 
	
}
