package com.example.tp3.query;

import com.example.tp3.domain.Pedido;
import com.example.tp3.domain.PedidoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class QueryService {
    private final PedidoRepository repository;
    public QueryService(PedidoRepository repository) {
        this.repository = repository;
    }
    public List<Pedido> listar() {
        return repository.findAll();
    }
    public Optional<Pedido> buscarPorId(String id) {
        return repository.findById(id);
    }
}