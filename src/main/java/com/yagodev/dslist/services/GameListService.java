package com.yagodev.dslist.services;

import com.yagodev.dslist.domain.dtos.GameListDTO;
import com.yagodev.dslist.domain.entities.GameList;
import com.yagodev.dslist.repositories.GameListRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    private GameListRepository gameListRepository;

    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> lists = gameListRepository.findAll();
        return lists.stream().map(GameListDTO::new).toList();
    }
    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        GameList list = gameListRepository.findById(id).get();
        return new GameListDTO(list);
    }
}
