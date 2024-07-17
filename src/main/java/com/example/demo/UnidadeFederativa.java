package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public enum UnidadeFederativa {


    RO("Rondônia", "Norte"),
    AC("Acre", "Norte"),
    AM("Amazonas", "Norte"),
    RR("Roraima", "Norte"),
    PA("Pará", "Norte"),
    AP("Amapá", "Norte"),
    TO("Tocantins", "Norte"),
    MA("Maranhão", "Nordeste"),
    PI("Piauí", "Nordeste"),
    CE("Ceará", "Nordeste"),
    RN("Rio Grande do Norte", "Nordeste"),
    PB("Paraíba", "Nordeste"),
    PE("Pernambuco", "Nordeste"),
    AL("Alagoas", "Nordeste"),
    SE("Sergipe", "Nordeste"),
    BA("Bahia", "Nordeste"),
    MG("Minas Gerais", "Sudeste"),
    ES("Espírito Santo", "Sudeste"),
    RJ("Rio de Janeiro", "Sudeste"),
    SP("São Paulo", "Sudeste"),
    PR("Paraná", "Sul"),
    SC("Santa Catarina", "Sul"),
    RS("Rio Grande do Sul", "Sul"),
    MS("Mato Grosso do Sul", "Centro-Oeste"),
    MT("Mato Grosso", "Centro-Oeste"),
    GO("Goiás", "Centro-Oeste"),
    DF("Distrito Federal", "Centro-Oeste");

    private final String nomePorExtenso;
    private final String regiao;

    public String getRegiao() {
        return regiao;
    }
    UnidadeFederativa(String nomePorExtenso, String regiao) {
        this.nomePorExtenso = nomePorExtenso;
        this.regiao = regiao;
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
    public static List<UnidadeFederativa> fromRegiao(String regiao){
        List<UnidadeFederativa> ufRegiao = new ArrayList<>();
        for(UnidadeFederativa uf : UnidadeFederativa.values()){
            if(uf.getRegiao().equalsIgnoreCase(regiao)){
                ufRegiao.add(uf);
            }
        }
        if(ufRegiao.isEmpty()){
            throw new IllegalArgumentException("Região inválida: " + regiao);
        }
        return ufRegiao;
    }
}
