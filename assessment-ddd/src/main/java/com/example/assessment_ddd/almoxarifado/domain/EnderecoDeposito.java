package com.example.assessment_ddd.almoxarifado.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class EnderecoDeposito {
    private String rua;
    private String numero;

    public EnderecoDeposito() {}

    public EnderecoDeposito(String rua, String numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() { return rua; }
    public String getNumero() { return numero; }
}