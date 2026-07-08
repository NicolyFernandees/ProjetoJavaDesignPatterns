package br.com.restaurante.adapter;
public class SistemaCozinhaExterno {
    public void enviarComanda(String nomeCliente, String numeroPedido, String mesa) {
        System.out.println("Pedido enviado para a cozinha:");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Número do pedido: " + numeroPedido);
        System.out.println("Mesa: " + mesa);
    }
}