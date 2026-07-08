package br.com.restaurante.adapter;
import br.com.restaurante.model.Pedido;

public class SistemaCozinhaAdapter implements EnvioPedido {
    private final SistemaCozinhaExterno sistemaCozinhaExterno;

    public SistemaCozinhaAdapter(SistemaCozinhaExterno sistemaCozinhaExterno) {
        this.sistemaCozinhaExterno = sistemaCozinhaExterno;
    }

    @Override
    public void enviar(Pedido pedido) {
        sistemaCozinhaExterno.enviarComanda(
                pedido.getNomeCliente(),
                "" + pedido.getNumeroPedido(),
                "" + pedido.getMesa()
        );
    }
}