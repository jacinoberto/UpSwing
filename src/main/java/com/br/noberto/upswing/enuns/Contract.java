package com.br.noberto.upswing.enuns;

public enum Contract {
    STAGE("Estágio"),
    EFFECTIVE("Efetivo");

    private final String contractType;

    Contract(String contractType){
        this.contractType = contractType;
    }

    public static Contract fromEducation(String contract){
        for (Contract contracts : Contract.values()){
            if (contracts.contractType.equalsIgnoreCase(contract)){
                return contracts;
            }
        }
        throw new IllegalArgumentException("Contrato: " + contract + " não foi encontrada!");
    }
}
