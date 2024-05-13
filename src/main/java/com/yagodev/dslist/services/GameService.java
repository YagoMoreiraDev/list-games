package com.yagodev.dslist.services;

import com.yagodev.dslist.domain.dtos.GameDTO;
import com.yagodev.dslist.domain.entities.Game;
import com.yagodev.dslist.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public List<GameDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        List<GameDTO> gameDTOs = games.stream().map(GameDTO::new).toList();
        return gameDTOs;
    }
}
