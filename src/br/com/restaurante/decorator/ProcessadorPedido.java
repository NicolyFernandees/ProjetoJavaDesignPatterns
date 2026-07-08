package br.com.restaurante.decorator;
import br.com.restaurante.model.Pedido;

public interface ProcessadorPedido {
    void processar(Pedido pedido);
}