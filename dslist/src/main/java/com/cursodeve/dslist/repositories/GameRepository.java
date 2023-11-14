package com.cursodeve.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursodeve.dslist.Entites.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
