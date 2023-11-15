package com.cursodeve.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.cursodeve.dslist.Entites.Game;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

public class GameDTO {

	private long id;
	private String title;
	private int year;
	private String genre;
	private String platforms;
	private String imgUrl;
	private Double score;
	private String shortDescription;
	private String longDescription;

	public GameDTO() {
		
	}
	
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);//aproventando os atributo da ent game
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	
}
