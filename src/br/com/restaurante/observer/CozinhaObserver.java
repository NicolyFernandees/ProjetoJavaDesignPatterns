package br.com.restaurante.observer;
import br.com.restaurante.model.Pedido;

public class CozinhaObserver implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("Cozinha avisada sobre o pedido " + pedido.getNumeroPedido());
    }
}