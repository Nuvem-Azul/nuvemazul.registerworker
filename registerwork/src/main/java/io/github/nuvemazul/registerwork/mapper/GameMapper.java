package io.github.nuvemazul.registerwork.mapper;

import java.util.List;

import io.github.nuvemazul.registerwork.dto.GameEventResponseDTO;
import io.github.nuvemazul.registerwork.entity.Download;
import io.github.nuvemazul.registerwork.entity.GameEntity;

public class GameMapper {
    public static GameEntity toEntity(GameEventResponseDTO dto){
        GameEntity game = GameEntity.builder()
                    .name(dto.name())
                    .description(dto.description())
                    .type(dto.type())
                    .imageUrl(dto.imageUrl())
                    .build();
        
        if(dto.download() != null && !dto.download().isEmpty()){
            List<Download> downloads = dto.download().stream()
            .map(d -> Download.builder()
            .service(d.service())
            .url(d.url())
            .game(game)
            .build())
            .toList();
        game.setDownloads(downloads);
        }
        return game;
    }
}
