package com.yagodev.dslist.controllers;

import com.yagodev.dslist.domain.dtos.GameDTO;
import com.yagodev.dslist.domain.dtos.GameMinDTO;
import com.yagodev.dslist.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAllGames() {
        return ResponseEntity.ok().body(gameService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameDTO> findGameById(@PathVariable Long id) {
        return ResponseEntity.ok().body(gameService.findById(id));
    }
}
