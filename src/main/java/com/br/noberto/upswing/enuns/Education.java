package com.br.noberto.upswing.enuns;

public enum Education {
    HIGH_SCHOOL("Ensino Médio"),
    TECHNICAL("Técnico"),
    HIGHER("Superior");

    private final String education;

    Education(String education){
        this.education = education;
    }

    public static Education fromEducation(String education){
        for (Education educations : Education.values()){
            if (educations.education.equalsIgnoreCase(education)){
                return educations;
            }
        }
        throw new IllegalArgumentException("Turno: " + education + " não foi encontrada!");
    }
}
