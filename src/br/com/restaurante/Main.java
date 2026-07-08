package br.com.restaurante;
import br.com.restaurante.observer.CozinhaObserver;
import br.com.restaurante.observer.GarcomObserver;
import br.com.restaurante.observer.PedidoNotificador;
import br.com.restaurante.adapter.EnvioPedido;
import br.com.restaurante.adapter.SistemaCozinhaAdapter;
import br.com.restaurante.adapter.SistemaCozinhaExterno;
import br.com.restaurante.builder.PedidoBuilder;
import br.com.restaurante.decorator.LogPedidoDecorator;
import br.com.restaurante.decorator.ProcessadorPedido;
import br.com.restaurante.decorator.ProcessadorPedidoSimples;
import br.com.restaurante.decorator.ValidacaoPedidoDecorator;
import br.com.restaurante.factory.PedidoFactory;
import br.com.restaurante.model.Pedido;
import br.com.restaurante.strategy.PreparoNormalStrategy;
import br.com.restaurante.strategy.PreparoRapidoStrategy;
import br.com.restaurante.strategy.TempoPreparoStrategy;

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

        TempoPreparoStrategy preparoNormal = new PreparoNormalStrategy();
        int tempoNormal = preparoNormal.calcularTempo(pedidoFactory);

        System.out.println("----- Strategy Normal -----");
        System.out.println("Tempo estimado: " + tempoNormal + " minutos");

        TempoPreparoStrategy preparoRapido = new PreparoRapidoStrategy();
        int tempoRapido = preparoRapido.calcularTempo(pedidoFactory);

        System.out.println("----- Strategy Rápido -----");
        System.out.println("Tempo estimado: " + tempoRapido + " minutos");

        SistemaCozinhaExterno sistemaCozinhaExterno = new SistemaCozinhaExterno();
        EnvioPedido envioPedido = new SistemaCozinhaAdapter(sistemaCozinhaExterno);

        System.out.println("----- Adapter -----");
        envioPedido.enviar(pedidoFactory);

        ProcessadorPedido processadorPedido = new LogPedidoDecorator(
                new ValidacaoPedidoDecorator(
                        new ProcessadorPedidoSimples()
                )
        );

        System.out.println("----- Decorator -----");
        processadorPedido.processar(pedidoFactory);

        PedidoNotificador pedidoNotificador = new PedidoNotificador();

        pedidoNotificador.adicionarObserver(new CozinhaObserver());
        pedidoNotificador.adicionarObserver(new GarcomObserver());

        System.out.println("----- Observer -----");
        pedidoNotificador.novoPedido(pedidoFactory);
    }
}