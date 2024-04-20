package Compras_Subastas;

import Inventario.Pieza;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Subasta {
    private Map<Pieza, List<Oferta>> ofertasPorPieza;
    private int precioMinimo;
    private boolean subastaFinalizada;

    public Subasta(List<Pieza> piezasSubasta, int precioMinimo) {
        this.ofertasPorPieza = new HashMap<>();
        for (Pieza pieza : piezasSubasta) {
            this.ofertasPorPieza.put(pieza, new ArrayList<>());
        }
        this.precioMinimo = precioMinimo;
        this.subastaFinalizada = false;
    }

    // Métodos getter y setter...

    public void iniciarSubasta() {
        subastaFinalizada = false;
        // Podemos notificar a los participantes que la subasta ha comenzado
    }

    public void hacerOferta(Cliente cliente, Pieza pieza, int cantidad) {
        if (!subastaFinalizada && ofertasPorPieza.containsKey(pieza) && cantidad >= precioMinimo) {
            Oferta oferta = new Oferta(cliente, pieza, cantidad);
            List<Oferta> ofertas = ofertasPorPieza.get(pieza);
            // Asumimos que la lista está ordenada con la oferta más alta al final
            if (!ofertas.isEmpty() && ofertas.get(ofertas.size() - 1).getCantidad() >= cantidad) {
                // Notificar al cliente que su oferta no es suficientemente alta
                return;
            }
            ofertas.add(oferta);
            // Notificar al cliente anterior que su oferta ha sido superada
            // ...
        }
    }

    public void finalizarSubasta() {
        subastaFinalizada = true;
        for (Pieza pieza : ofertasPorPieza.keySet()) {
            List<Oferta> ofertas = ofertasPorPieza.get(pieza);
            if (!ofertas.isEmpty()) {
                Oferta ofertaGanadora = ofertas.get(ofertas.size() - 1);
                // Aquí procesaríamos la venta de la pieza al cliente de la oferta ganadora
                // ...
                // Notificar a todos los oferentes que la subasta ha finalizado
            }
        }
        // Notificar a los participantes que la subasta ha concluido
    }
}

