package br.com.restaurante.strategy;
import br.com.restaurante.model.Pedido;

public class PreparoRapidoStrategy implements TempoPreparoStrategy {
    @Override
    public int calcularTempo(Pedido pedido) {
        return 15;
    }
}