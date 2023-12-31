package com.br.noberto.upswing.enuns;

public enum CourseLevel {
    FREE("Livre"),
    TECHNICIAN("Técnico"),
    HIGHER("Superior");

    private final String courseLevel;

    CourseLevel(String courseLevel){
        this.courseLevel = courseLevel;
    }

    public static CourseLevel fromCourse(String level){
        for (CourseLevel courses : CourseLevel.values()){
            if (courses.courseLevel.equalsIgnoreCase(level)){
                return courses;
            }
        }
        throw new IllegalArgumentException("Curso: " + level + " não foi encontrada!");
    }
}
