package com.example.demo;

public enum UnidadeFederativa {


    RO("Rondônia"),
    AC("Acre"),
    AM("Amazonas"),
    RR("Roraima"),
    PA("Pará"),
    AP("Amapá"),
    TO("Tocantins"),
    MA("Maranhão"),
    PI("Piauí"),
    CE("Ceará"),
    RN("Rio Grande do Norte"),
    PB("Paraíba"),
    PE("Pernambuco"),
    AL("Alagoas"),
    SE("Sergipe"),
    BA("Bahia"),
    MG("Minas Gerais"),
    ES("Espírito Santo"),
    RJ("Rio de Janeiro"),
    SP("São Paulo"),
    PR("Paraná"),
    SC("Santa Catarina"),
    RS("Rio Grande do Sul"),
    MS("Mato Grosso do Sul"),
    MT("Mato Grosso"),
    GO("Goiás"),
    DF("Distrito Federal");

    private final String nomePorExtenso;

    UnidadeFederativa(String nomePorExtenso) {
        this.nomePorExtenso = nomePorExtenso;
    }

    public String getNomePorExtenso() {
        return nomePorExtenso;
    }

    public static UnidadeFederativa fromNomePorExtenso(String nomePorExtenso) {
        for (UnidadeFederativa uf : UnidadeFederativa.values()) {
            if (uf.name().equalsIgnoreCase(nomePorExtenso)) {
                return uf;
            }
        }
        throw new IllegalArgumentException("UF não encontrada: " + nomePorExtenso);
    }
}
