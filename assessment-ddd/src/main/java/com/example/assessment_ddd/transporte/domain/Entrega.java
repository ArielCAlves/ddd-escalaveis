package com.example.assessment_ddd.transporte.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Entrega {
    @Id
    private String id;
    private String pedidoId;
    @Embedded
    private EnderecoEntrega destino;

    public Entrega() {}

    public Entrega(String id, String pedidoId, EnderecoEntrega destino) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.destino = destino;
    }

    public String getId() { return id; }
    public String getPedidoId() { return pedidoId; }
    public EnderecoEntrega getDestino() { return destino; }
}