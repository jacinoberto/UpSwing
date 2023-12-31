package com.br.noberto.upswing.domains;

import com.br.noberto.upswing.dtos.ClassDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "registrations")
@AllArgsConstructor @NoArgsConstructor @Data
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_registration")
    private UUID id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Class aClass;
}
