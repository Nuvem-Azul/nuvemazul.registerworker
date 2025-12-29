package io.github.nuvemazul.registerwork.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import io.github.nuvemazul.registerwork.dto.GameEventResponseDTO;
import jakarta.validation.Valid;

@Service
public class ServiceWorker {

    private GameService gameService;

    public ServiceWorker(GameService gameService){
        this.gameService = gameService;
    }
    
    @RabbitListener(queues = "${rabbitmq.queue.name}", 
    containerFactory = "rabbitListenerContainerFactory")
    public void processMessage(@Valid GameEventResponseDTO dto) {
       gameService.create(dto);
    }
}
