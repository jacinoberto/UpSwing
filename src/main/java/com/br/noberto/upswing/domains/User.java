package com.br.noberto.upswing.domains;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Embeddable
@AllArgsConstructor @NoArgsConstructor @Data
public class User {

    private String name;
    private Date dateOfBirth;
    private String cpf;
    private String phoneOne;
    private String phoneTwo;
    private String socialOne;
    private String socialTwo;
    private String socialThree;
    private String socialFour;
    private String email;
    private String password;
    private Boolean activeProfile = true;
}
