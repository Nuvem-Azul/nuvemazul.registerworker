package io.github.nuvemazul.registerwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.nuvemazul.registerwork.entity.GameEntity;

public interface GamesRepository extends JpaRepository<GameEntity, Long>{

}
