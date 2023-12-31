package com.br.noberto.upswing.enuns;

public enum OccupationArea {
    TI_PROGRAMING("Tecnologia"),
    DESIGN("Design"),
    MULTIMEDIA("Multimídia"),
    MARKETING_SALE("Marketing e Venda"),
    SUPPORT("Suporte"),
    MANAGEMENT("Gestão"),
    FINANCE_ADMINISTRATION("Finanças e Administração"),
    LEGAL("Jurídico"),
    ENGINEERING_MANUFACTURING("Engenharia e Manufatura");

    private final String occupationArea;

    OccupationArea(String occupationArea){
        this.occupationArea = occupationArea;
    }

    public static OccupationArea fromArea(String area){
        for (OccupationArea occupationAreas : OccupationArea.values()){
            if (occupationAreas.occupationArea.equalsIgnoreCase(area)){
                return occupationAreas;
            }
        }
        throw new IllegalArgumentException("Área de Atuação: " + area + " não foi encontrada!");
    }
}
