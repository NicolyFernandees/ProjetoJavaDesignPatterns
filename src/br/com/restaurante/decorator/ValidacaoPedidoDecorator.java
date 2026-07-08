package br.com.restaurante.decorator;
import br.com.restaurante.model.Pedido;

public class ValidacaoPedidoDecorator extends PedidoDecorator {
    public ValidacaoPedidoDecorator(ProcessadorPedido processadorPedido) {
        super(processadorPedido);
    }

    @Override
    public void processar(Pedido pedido) {
        if (pedido.getNomeCliente() == null || pedido.getNomeCliente().isBlank()) {
            System.out.println("Erro: o nome do cliente é obrigatório.");
            return;
        }

        if (pedido.getNumeroPedido() <= 0) {
            System.out.println("Erro: o número do pedido deve ser maior que zero.");
            return;
        }

        if (pedido.getMesa() <= 0) {
            System.out.println("Erro: a mesa deve ser maior que zero.");
            return;
        }

        super.processar(pedido);
    }
}