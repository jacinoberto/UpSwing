package com.br.noberto.upswing.domains;

import com.br.noberto.upswing.dtos.CompanyDTO;
import com.br.noberto.upswing.enuns.OccupationArea;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "tb_companies")
@AllArgsConstructor @NoArgsConstructor @Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_company")
    private UUID id;
    private String corporateName;
    private String fantasyName;
    private String cnpj;
    private OccupationArea occupationArea;
    private String description;
    private String site;
    private String phoneOne;
    private String phoneTwo;
    private String socialOne;
    private String socialTwo;
    private String socialThree;
    private String socialFour;
    private String email;
    private String password;
    private Boolean activeProfile;

    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;

    public Company(CompanyDTO company) {
        this.corporateName = company.corporateName();
        this.fantasyName = company.fantasyName();
        this.cnpj = company.cnpj();
        this.occupationArea = OccupationArea.fromArea(company.occupationArea());
        this.description = company.description();
        this.site = company.site();
        this.phoneOne = company.phoneOne();
        this.phoneTwo = company.phoneTwo();
        this.socialOne = company.socialThree();
        this.socialTwo = company.socialTwo();
        this.socialThree = company.socialThree();
        this.socialFour = company.socialFour();
        this.email = company.email();
        this.password = company.email();
        this.activeProfile = true;
        this.address = new Address(company.address());
    }
}
