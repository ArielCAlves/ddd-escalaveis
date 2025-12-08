package com.example.assessment_ddd.almoxarifado.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PedidoAlmoxarifado {
    @Id
    private String id;
    private String pedidoId;
    @Embedded
    private EnderecoDeposito deposito;

    public PedidoAlmoxarifado() {}

    public PedidoAlmoxarifado(String id, String pedidoId, EnderecoDeposito deposito) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.deposito = deposito;
    }

    public String getId() { return id; }
    public String getPedidoId() { return pedidoId; }
    public EnderecoDeposito getDeposito() { return deposito; }
}