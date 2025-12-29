package io.github.nuvemazul.registerwork.service;

import org.springframework.stereotype.Service;

import io.github.nuvemazul.registerwork.dto.GameEventResponseDTO;
import io.github.nuvemazul.registerwork.entity.GameEntity;
import io.github.nuvemazul.registerwork.mapper.GameMapper;
import io.github.nuvemazul.registerwork.repository.GamesRepository;
import jakarta.transaction.Transactional;

@Service
public class GameService {

    private GamesRepository gamesRepository;

    public GameService(GamesRepository gamesRepository) {
        this.gamesRepository = gamesRepository;
    }

    @Transactional
    public void create(GameEventResponseDTO dto) {
        GameEntity game = GameMapper.toEntity(dto);
        gamesRepository.save(game);
    }

}
