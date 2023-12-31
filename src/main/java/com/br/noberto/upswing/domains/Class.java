package com.br.noberto.upswing.domains;

import com.br.noberto.upswing.dtos.ClassDTO;
import com.br.noberto.upswing.enuns.Modality;
import com.br.noberto.upswing.enuns.Shift;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_classes")
@AllArgsConstructor @NoArgsConstructor @Data
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_class")
    private UUID id;
    private Integer code;
    private Modality modality;
    private Shift shift;

    @Column(name = "start_date")
    private Date statDate;
    private Integer vacancies;

    @Column(name = "end_date")
    private Date endDate;

    @ManyToOne(cascade = CascadeType.ALL)
    Course course;

    @OneToMany(mappedBy = "aClass")
    private List<Registration> registrations = new ArrayList<>();

    public Class(ClassDTO classDTO) {
        this.code = classDTO.code();
        this.modality = Modality.fromModality(classDTO.modality());
        this.shift = Shift.fromShift(classDTO.shift());
        this.statDate = classDTO.statDate();
        this.vacancies = classDTO.vacancies();
        this.endDate = classDTO.endDate();
        this.course = new Course(classDTO.course());
    }
}
