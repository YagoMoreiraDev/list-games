package com.yagodev.dslist.controllers;

import com.yagodev.dslist.domain.dtos.GameDTO;
import com.yagodev.dslist.domain.dtos.GameListDTO;
import com.yagodev.dslist.domain.dtos.GameMinDTO;
import com.yagodev.dslist.services.GameListService;
import com.yagodev.dslist.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    private GameListService gameListService;

    public GameListController(GameListService gameListService) {
        this.gameListService = gameListService;
    }

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAllGames() {
        return ResponseEntity.ok().body(gameListService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameListDTO> findGameById(@PathVariable Long id) {
        return ResponseEntity.ok().body(gameListService.findById(id));
    }
}
