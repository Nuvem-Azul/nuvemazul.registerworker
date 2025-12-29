package io.github.nuvemazul.registerwork.dto;

import jakarta.validation.constraints.NotBlank;

public record DownloadResponseDTO(
        @NotBlank String service,
        @NotBlank String url) {
}
