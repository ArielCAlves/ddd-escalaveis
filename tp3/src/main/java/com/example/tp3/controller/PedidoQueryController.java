package com.example.tp3.controller;

import com.example.tp3.domain.Pedido;
import com.example.tp3.query.QueryService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoQueryController {
    private final QueryService service;
    public PedidoQueryController(QueryService service) {
        this.service = service;
    }
    @GetMapping
    public List<Pedido> listar() {
        return service.listar();
    }
    @GetMapping("/{id}")
    public Optional<Pedido> buscarPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }
}