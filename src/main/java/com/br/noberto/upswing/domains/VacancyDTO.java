package com.br.noberto.upswing.domains;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;

public record VacancyDTO(
        @NotBlank
        String office,
        @NotBlank
        String occupationArea,
        @NotBlank
        String educationType,
        @NotBlank
        String contract,
        @NotNull
        BigDecimal remuneration,
        @NotNull
        Boolean disabledPerson,
        @NotNull
        Integer vacancies,
        @NotNull
        Date term,
        @NotBlank
        String description,
        @NotBlank
        String jobFunctions,
        @NotNull
        Boolean meal,
        @NotNull
        Boolean foodVoucher,
        @NotNull
        Boolean transportationAllowance,
        @NotNull
        Boolean culture,
        @NotNull
        Boolean education,
        @NotNull
        Boolean healthPlan
) {
}
