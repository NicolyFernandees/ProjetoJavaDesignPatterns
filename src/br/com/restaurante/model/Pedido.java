package br.com.restaurante.model;

public class Pedido {
    private final String nomeCliente;
    private final int numeroPedido;
    private final int mesa;

    public Pedido(String nomeCliente, int numeroPedido, int mesa) {
        this.nomeCliente = nomeCliente;
        this.numeroPedido = numeroPedido;
        this.mesa = mesa;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public int getMesa() {
        return mesa;
    }

    @Override
    public String toString() {
        return "Pedido " + "Cliente: " + nomeCliente + ", Pedido: " + numeroPedido + ", Mesa: " + mesa;
    }
}