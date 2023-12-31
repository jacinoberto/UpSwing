package com.br.noberto.upswing.domains;

import com.br.noberto.upswing.dtos.ZipCodeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "zipCode")
    List<Address> addresses = new ArrayList<>();

    public ZipCode(ZipCodeDTO zipCode) {
        this.zipCode = zipCode.zipCode();
        this.street = zipCode.street();
        this.neighborhood = zipCode.neighborhood();
        this.city = zipCode.city();
        this.state = zipCode.state();
    }
}
