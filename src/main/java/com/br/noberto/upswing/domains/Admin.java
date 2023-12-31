package com.br.noberto.upswing.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tb_admins")
@AllArgsConstructor @NoArgsConstructor @Data
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_office")
    private UUID id;
    private String office;
    private String name;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    private String cpf;
    @Column(name = "phone_one")
    private String phoneOne;
    @Column(name = "phone_two")
    private String phoneTwo;
    private String email;
    private String password;
    @Column(name = "active_profile")
    private Boolean activeProfile = true;
}
