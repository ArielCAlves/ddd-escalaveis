package com.example.tp3.aggregate;

import com.example.tp3.command.CriarPedidoCommand;
import com.example.tp3.domain.Pedido;
import com.example.tp3.domain.PedidoRepository;
import com.example.tp3.event.PedidoCriadoEvent;
import org.springframework.stereotype.Component;

@Component
public class PedidoCommandHandler {
    private final PedidoRepository repository;
    public PedidoCommandHandler(PedidoRepository repository) {
        this.repository = repository;
    }
    public PedidoCriadoEvent handle(CriarPedidoCommand command) {
        Pedido pedido = new Pedido(command.getId(), command.getDescricao());
        repository.save(pedido);
        return new PedidoCriadoEvent(command.getId(), command.getDescricao());
    }
}