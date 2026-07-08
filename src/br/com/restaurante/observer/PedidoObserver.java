package br.com.restaurante.observer;
import br.com.restaurante.model.Pedido;

public interface PedidoObserver {
    void atualizar(Pedido pedido);
}