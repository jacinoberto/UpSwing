package com.br.noberto.upswing.enuns;

public enum Modality {
    EAD("EAD"),
    HYBRID("Híbrido"),
    IN_PERSON("Presencial");

    private final String modality;

    Modality(String modality){
        this.modality = modality;
    }

    public static Modality fromModality(String modality){
        for (Modality modalities : Modality.values()){
            if (modalities.modality.equalsIgnoreCase(modality)){
                return modalities;
            }
        }
        throw new IllegalArgumentException("Curso: " + modality + " não foi encontrada!");
    }
}
