package com.br.noberto.upswing.dtos;

import jakarta.validation.constraints.NotBlank;

public record ZipCodeDTO(
        @NotBlank
        String zipCode,
        @NotBlank
        String street,
        @NotBlank
        String neighborhood,
        @NotBlank
        String city,
        @NotBlank
        String state
) {
}
