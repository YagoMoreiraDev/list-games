package com.yagodev.dslist.repositories;

import com.yagodev.dslist.domain.entities.Game;
import com.yagodev.dslist.domain.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
