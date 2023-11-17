package com.cursodeve.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cursodeve.dslist.Entites.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
	@Modifying // quando não usa select é preciso dessa anotation
	@Query(nativeQuery = true, 
	value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
	void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
