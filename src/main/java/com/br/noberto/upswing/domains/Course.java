package com.br.noberto.upswing.domains;

import com.br.noberto.upswing.dtos.CourseDTO;
import com.br.noberto.upswing.enuns.CourseLevel;
import com.br.noberto.upswing.enuns.OccupationArea;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_course")
    private UUID id;
    private String course;

    @Column(name = "occupation_area")
    @Enumerated(value = EnumType.STRING)
    private OccupationArea occupationArea;

    @Column(name = "course_level")
    @Enumerated(value = EnumType.STRING)
    private CourseLevel courseLevel;
    private Integer workload;

    @Column(name = "monthly_value")
    private BigDecimal monthlyValue;

    @Column(name = "total_value")
    private BigDecimal totalValue;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    List<Discipline> disciplines = new ArrayList<>();

    @OneToMany(mappedBy = "course")
    List<Class> classes = new ArrayList<>();

    public Course(CourseDTO course) {
        this.course = course.course();
        this.occupationArea = OccupationArea.fromArea(course.occupation_area());
        this.courseLevel = CourseLevel.fromCourse(course.courseLevel());
        this.workload = course.workload();
        this.monthlyValue = course.monthlyValue();
        this.totalValue = course.totalValue();
    }
}
