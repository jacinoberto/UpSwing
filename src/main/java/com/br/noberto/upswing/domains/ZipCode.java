package com.br.noberto.upswing.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_zip_codes")
@AllArgsConstructor @NoArgsConstructor @Data
public class ZipCode {

    @Id
    @Column(name = "id_zipCode")
    private String zipCode;
    private String street;
    private String neighborhood;
    private String city;
    private String state;
}
