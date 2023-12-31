package com.br.noberto.upswing.domains;

import com.br.noberto.upswing.enuns.Contract;
import com.br.noberto.upswing.enuns.Education;
import com.br.noberto.upswing.enuns.OccupationArea;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tb_vacancies")
@AllArgsConstructor @NoArgsConstructor @Data
public class Vacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_vacancy")
    private UUID id;
    private String office;

    @Column(name = "occupation_area")
    private OccupationArea occupationArea;

    @Column(name = "education_type")
    private Education educationType;
    private Contract contract;
    private BigDecimal remuneration;

    @Column(name = "disable_person")
    private Boolean disabledPerson;
    private Integer vacancies;
    private Date term;
    private String description;

    @Column(name = "job_functions")
    private String jobFunctions;
    private Boolean meal;

    @Column(name = "food_voucher")
    private Boolean foodVoucher;

    @Column(name = "transportation_allowance")
    private Boolean transportationAllowance;
    private Boolean culture;
    private Boolean education;

    @Column(name = "health_plan")
    private Boolean healthPlan;

    public Vacancy(VacancyDTO vacancy) {
        this.office = vacancy.office();
        this.occupationArea = OccupationArea.fromArea(vacancy.occupationArea());
        this.educationType = Education.fromEducation(vacancy.educationType());
        this.contract = Contract.fromEducation(vacancy.contract());
        this.remuneration = vacancy.remuneration();
        this.disabledPerson = vacancy.disabledPerson();
        this.vacancies = vacancy.vacancies();
        this.term = vacancy.term();
        this.description = vacancy.description();
        this.jobFunctions = vacancy.jobFunctions();
        this.meal = vacancy.meal();
        this.foodVoucher = vacancy.foodVoucher();
        this.transportationAllowance = vacancy.transportationAllowance();
        this.culture = vacancy.culture();
        this.education = vacancy.education();
        this.healthPlan = vacancy.healthPlan();
    }
}
