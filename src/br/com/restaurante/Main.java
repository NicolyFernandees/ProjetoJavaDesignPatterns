package br.com.restaurante;
import br.com.restaurante.builder.PedidoBuilder;
import br.com.restaurante.model.Pedido;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new PedidoBuilder()
                .comNomeCliente("Nicoly")
                .comNumeroPedido(1)
                .comMesa(7)
                .construir();

        System.out.println("----- Restaurante -----");
        System.out.println(pedido);
    }
}