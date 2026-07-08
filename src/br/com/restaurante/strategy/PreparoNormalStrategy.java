package br.com.restaurante.strategy;
import br.com.restaurante.model.Pedido;

public class PreparoNormalStrategy implements TempoPreparoStrategy {
    @Override
    public int calcularTempo(Pedido pedido) {
        return 30;
    }
}