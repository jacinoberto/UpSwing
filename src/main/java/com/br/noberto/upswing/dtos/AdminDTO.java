package com.br.noberto.upswing.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

public record AdminDTO(
        @NotBlank
        String office,
        UserDTO user
) {
}
