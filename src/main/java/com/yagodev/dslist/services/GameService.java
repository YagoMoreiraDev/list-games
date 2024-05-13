package com.yagodev.dslist.services;

import com.yagodev.dslist.domain.dtos.GameDTO;
import com.yagodev.dslist.domain.dtos.GameMinDTO;
import com.yagodev.dslist.domain.entities.Game;
import com.yagodev.dslist.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        List<GameMinDTO> gameMinDTOS = games.stream().map(GameMinDTO::new).toList();
        return gameMinDTOS;
    }
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game game = gameRepository.findById(id).get();
        return new GameDTO(game);
    }
}
