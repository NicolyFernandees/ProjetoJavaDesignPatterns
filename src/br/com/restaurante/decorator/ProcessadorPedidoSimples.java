package br.com.restaurante.decorator;
import br.com.restaurante.model.Pedido;

public class ProcessadorPedidoSimples implements ProcessadorPedido {
    @Override
    public void processar(Pedido pedido) {
        System.out.println("Pedido processado.");
        System.out.println(pedido);
    }
}