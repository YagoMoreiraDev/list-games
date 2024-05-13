package com.yagodev.dslist.repositories;

import com.yagodev.dslist.domain.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
