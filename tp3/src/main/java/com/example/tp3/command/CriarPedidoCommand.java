package com.example.tp3.command;

public class CriarPedidoCommand extends BaseCommand {
    private final String descricao;
    public CriarPedidoCommand(String id, String descricao) {
        super(id);
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}