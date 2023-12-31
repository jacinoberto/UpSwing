package com.br.noberto.upswing.dtos;

import com.br.noberto.upswing.domains.Course;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

public record DisciplineDTO(
        @NotBlank
        String discipline,
        @NotBlank
        String description,
        Course course
) {
}
