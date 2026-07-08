package br.com.restaurante.decorator;
import br.com.restaurante.model.Pedido;

public class PedidoDecorator implements ProcessadorPedido {
    protected ProcessadorPedido processadorPedido;

    public PedidoDecorator(ProcessadorPedido processadorPedido) {
        this.processadorPedido = processadorPedido;
    }

    @Override
    public void processar(Pedido pedido) {
        processadorPedido.processar(pedido);
    }
}