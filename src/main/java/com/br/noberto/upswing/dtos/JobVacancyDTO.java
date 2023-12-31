package com.br.noberto.upswing.dtos;

import com.br.noberto.upswing.domains.Student;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record JobVacancyDTO(
        @NotNull
        Boolean course,
        @NotBlank
        String contractType,
        @NotBlank
        String location,
        StudentDTO student
) {
}
