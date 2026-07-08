package br.com.restaurante;
import br.com.restaurante.builder.PedidoBuilder;
import br.com.restaurante.factory.PedidoFactory;
import br.com.restaurante.model.Pedido;

public class Main {
    public static void main(String[] args) {
        Pedido pedidoBuilder = new PedidoBuilder()
                .comNomeCliente("Nicoly")
                .comNumeroPedido(1)
                .comMesa(7)
                .construir();

        System.out.println("----- Builder -----");
        System.out.println(pedidoBuilder);

        Pedido pedidoFactory = PedidoFactory.criarPedido("Maria", 2, 5);

        System.out.println("----- Factory -----");
        System.out.println(pedidoFactory);
    }
}