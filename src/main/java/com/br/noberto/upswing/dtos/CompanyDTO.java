package com.br.noberto.upswing.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

import java.util.UUID;

public record CompanyDTO(
        @NotBlank
        String corporateName,
        String fantasyName,
        @NotBlank
        @CNPJ
        String cnpj,
        @NotBlank
        String occupationArea,
        @NotBlank
        String description,
        String site,
        @NotBlank
        String phoneOne,
        String phoneTwo,
        String socialOne,
        String socialTwo,
        String socialThree,
        String socialFour,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String password,
        AddressDTO address
) {
}
