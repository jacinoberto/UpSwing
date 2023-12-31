package com.br.noberto.upswing.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Date;

public record UserDTO(
        @NotBlank
        String name,
        @NotNull
        Date dateOfBirth,
        @NotBlank
        @CPF
        String cpf,
        String socialOne,
        String socialTwo,
        String socialThree,
        String socialFour,
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
