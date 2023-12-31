package com.br.noberto.upswing.domains;

import com.br.noberto.upswing.dtos.AddressDTO;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_address")
    private UUID id;
    private Integer number;
    private String complement;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ZipCode zipCode;

    @OneToMany(mappedBy = "address")
    List<Company> companies = new ArrayList<>();

    @OneToMany(mappedBy = "address")
    List<Student> students = new ArrayList<>();

    public Address(AddressDTO address) {
        this.number = address.number();
        this.complement = address.complement();
        this.zipCode = new ZipCode(address.zipCode());
    }
}
