package com.example.tp3.aggregate;

import com.example.tp3.domain.Pedido;
import com.example.tp3.domain.PedidoRepository;
import com.example.tp3.event.PedidoCriadoEvent;
import org.springframework.stereotype.Component;

@Component
public class PedidoEventSourcingHandler {
    private final PedidoRepository repository;
    public PedidoEventSourcingHandler(PedidoRepository repository) {
        this.repository = repository;
    }
    public void on(PedidoCriadoEvent event) {
        Pedido pedido = new Pedido(event.getId(), event.getDescricao());
        repository.save(pedido);
    }
}