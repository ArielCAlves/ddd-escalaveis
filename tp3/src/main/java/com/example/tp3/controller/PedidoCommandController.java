package com.example.tp3.controller;

import com.example.tp3.command.CommandService;
import com.example.tp3.command.CriarPedidoCommand;
import com.example.tp3.event.PedidoCriadoEvent;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoCommandController {
    private final CommandService service;
    public PedidoCommandController(CommandService service) {
        this.service = service;
    }
    @PostMapping
    public PedidoCriadoEvent criar(@RequestParam String id, @RequestParam String descricao) {
        return service.executar(new CriarPedidoCommand(id, descricao));
    }
}