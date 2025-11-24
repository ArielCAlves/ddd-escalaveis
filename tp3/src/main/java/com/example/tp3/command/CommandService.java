package com.example.tp3.command;

import com.example.tp3.aggregate.PedidoCommandHandler;
import com.example.tp3.event.PedidoCriadoEvent;
import org.springframework.stereotype.Service;

@Service
public class CommandService {
    private final PedidoCommandHandler handler;
    public CommandService(PedidoCommandHandler handler) {
        this.handler = handler;
    }
    public PedidoCriadoEvent executar(CriarPedidoCommand command) {
        return handler.handle(command);
    }
}