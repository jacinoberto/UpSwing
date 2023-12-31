package com.br.noberto.upswing.dtos;

import jakarta.validation.constraints.NotNull;

public record StudentDTO(
        @NotNull
        Integer registration,
        UserDTO user
) {
}
