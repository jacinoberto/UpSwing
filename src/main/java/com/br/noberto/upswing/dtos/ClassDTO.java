package com.br.noberto.upswing.dtos;

import java.util.Date;

public record ClassDTO(
        Integer code,
        String modality,
        String shift,
        Date statDate,
        Date endDate,
        Integer vacancies,
        CourseDTO course
) {
}
