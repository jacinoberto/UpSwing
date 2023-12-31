package com.br.noberto.upswing.enuns;

public enum Shift {
    MORNING("Matutino"),
    AFTERNOON("Vespertino"),
    NIGHT("Noturno");

    private final String shift;

    Shift(String shift){
        this.shift = shift;
    }

    public static Shift fromShift(String shift){
        for (Shift shifts : Shift.values()){
            if (shifts.shift.equalsIgnoreCase(shift)){
                return shifts;
            }
        }
        throw new IllegalArgumentException("Turno: " + shift + " não foi encontrada!");
    }
}
