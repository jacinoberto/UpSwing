package com.br.noberto.upswing.enuns;

public enum Course {
    FREE("Livre"),
    TECHNICIAN("Técnico"),
    HIGHER("Superior");

    private final String courseLevel;

    Course(String courseLevel){
        this.courseLevel = courseLevel;
    }

    public static Course fromCourse(String level){
        for (Course courses : Course.values()){
            if (courses.courseLevel.equalsIgnoreCase(level)){
                return courses;
            }
        }
        throw new IllegalArgumentException("Curso: " + level + " não foi encontrada!");
    }
}
