package com.br.noberto.upswing.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "tb_disciplines")
@AllArgsConstructor @NoArgsConstructor @Data
public class Discipline {

    @Id
    @Column(name = "id_discipline")
    private UUID id;
    private String discipline;
    private String description;

    @ManyToOne
    private Course course;
}
