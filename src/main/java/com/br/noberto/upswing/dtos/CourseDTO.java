package com.br.noberto.upswing.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record CourseDTO(
        @NotBlank
        String course,
        @NotBlank
        String occupation_area,
        @NotBlank
        String courseLevel,
        @NotNull
        Integer workload,
        @NotNull
        BigDecimal monthlyValue,
        @NotNull
        BigDecimal totalValue
) {
}
