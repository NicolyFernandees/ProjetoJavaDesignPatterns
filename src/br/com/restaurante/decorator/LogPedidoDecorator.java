package br.com.restaurante.decorator;
import br.com.restaurante.model.Pedido;

public class LogPedidoDecorator extends PedidoDecorator {
    public LogPedidoDecorator(ProcessadorPedido processadorPedido) {
        super(processadorPedido);
    }

    @Override
    public void processar(Pedido pedido) {
        System.out.println("Iniciando processamento do pedido...");
        super.processar(pedido);
        System.out.println("Finalizando processamento do pedido...");
    }
}