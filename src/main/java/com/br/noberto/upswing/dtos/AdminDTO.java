package com.br.noberto.upswing.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

public record AdminDTO(
        @NotBlank
        String office,
        @NotBlank
        String name,
        @NotNull
        Date dateOfBirth,
        @NotBlank
        @CPF
        String cpf,
        @NotBlank
        String phoneOne,
        String phoneTwo,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String password
) {
}
