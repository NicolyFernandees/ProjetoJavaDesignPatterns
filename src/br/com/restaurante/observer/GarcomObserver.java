package br.com.restaurante.observer;
import br.com.restaurante.model.Pedido;

public class GarcomObserver implements PedidoObserver {
    @Override
    public void atualizar(Pedido pedido) {
        System.out.println("Garçom avisado para acompanhar a mesa " + pedido.getMesa());
    }
}