package com.example.assessment_ddd.transporte.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class EnderecoEntrega {
    private String rua;
    private String numero;

    public EnderecoEntrega() {}

    public EnderecoEntrega(String rua, String numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() { return rua; }
    public String getNumero() { return numero; }
}