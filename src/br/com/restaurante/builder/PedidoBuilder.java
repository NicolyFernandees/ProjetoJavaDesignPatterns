package br.com.restaurante.builder;
import br.com.restaurante.model.Pedido;

public class PedidoBuilder {
    private String nomeCliente;
    private int numeroPedido;
    private int mesa;

    public PedidoBuilder comNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        return this;
    }

    public PedidoBuilder comNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        return this;
    }

    public PedidoBuilder comMesa(int mesa) {
        this.mesa = mesa;
        return this;
    }

    public Pedido construir() {
        return new Pedido(nomeCliente, numeroPedido, mesa);
    }
}