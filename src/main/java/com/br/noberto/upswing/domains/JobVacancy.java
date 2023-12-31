package com.br.noberto.upswing.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.flywaydb.core.internal.util.BooleanEvaluator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_job_vacancies")
@AllArgsConstructor @NoArgsConstructor @Data
public class JobVacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_job_vacancy")
    private UUID id;
    private Boolean course;

    @Column(name = "contract_type")
    private String contractType;
    private String locality;

    @OneToMany
    private List<Student> students = new ArrayList<>();
}
