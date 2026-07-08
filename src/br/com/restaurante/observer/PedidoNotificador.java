package br.com.restaurante.observer;
import br.com.restaurante.model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoNotificador {
    private List<PedidoObserver> observers = new ArrayList<>();

    public void adicionarObserver(PedidoObserver observer) {
        observers.add(observer);
    }

    public void notificar(Pedido pedido) {
        for (PedidoObserver observer : observers) {
            observer.atualizar(pedido);
        }
    }

    public void novoPedido(Pedido pedido) {
        System.out.println("Novo pedido criado: " + pedido.getNumeroPedido());
        notificar(pedido);
    }
}