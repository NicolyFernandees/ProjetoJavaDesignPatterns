package br.com.restaurante.strategy;
import br.com.restaurante.model.Pedido;

public interface TempoPreparoStrategy {
    int calcularTempo(Pedido pedido);
}