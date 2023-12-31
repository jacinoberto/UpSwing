package com.br.noberto.upswing.dtos;

public record ZipCodeDTO(
        String zipCode,
        String street,
        String neighborhood,
        String city,
        String state
) {
}
