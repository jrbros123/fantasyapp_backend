package com.example.fantasy_nba.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player getPlayerById(Long id) {
        Optional<Player> player = playerRepository.findById(id);
        return player.orElse(null);
    }

    public void deletePlayerById(Long id) {
        playerRepository.deleteById(id);
    }
}
