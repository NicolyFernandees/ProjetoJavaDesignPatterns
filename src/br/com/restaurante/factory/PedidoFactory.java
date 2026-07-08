package br.com.restaurante.factory;
import br.com.restaurante.builder.PedidoBuilder;
import br.com.restaurante.model.Pedido;

public class PedidoFactory {
    public static Pedido criarPedido(String nomeCliente, int numeroPedido, int mesa) {
        return new PedidoBuilder()
                .comNomeCliente(nomeCliente)
                .comNumeroPedido(numeroPedido)
                .comMesa(mesa)
                .construir();
    }
}