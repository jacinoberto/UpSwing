package com.br.noberto.upswing.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table (name = "tb_students")
@AllArgsConstructor @NoArgsConstructor @Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_student")
    private UUID id;
    private Integer registration;
    @Embedded
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "student")
    private List<Registration> registrations = new ArrayList<>();

    @ManyToOne
    private JobVacancy jobVacancy;
}
