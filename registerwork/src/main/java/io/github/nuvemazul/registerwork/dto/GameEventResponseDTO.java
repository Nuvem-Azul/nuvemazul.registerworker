package io.github.nuvemazul.registerwork.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;

public record GameEventResponseDTO(
                @NotBlank String name,
                @NotBlank String description,
                @NotBlank String type,
                @NotBlank String imageUrl,
                List<DownloadResponseDTO> download) {
}
