package com.example.tp3.event;

public class PedidoCriadoEvent extends BaseEvent {
    private final String descricao;
    public PedidoCriadoEvent(String id, String descricao) {
        super(id);
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}