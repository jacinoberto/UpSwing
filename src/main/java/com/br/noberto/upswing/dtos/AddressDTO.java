package com.br.noberto.upswing.dtos;

public record AddressDTO(
        Integer number,
        String complement,
        ZipCodeDTO zipCode
) {
}
