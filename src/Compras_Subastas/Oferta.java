package Compras_Subastas;

import Inventario.Pieza;

public class Oferta {
    private Cliente cliente;
    private Pieza pieza;
    private int cantidad;
    private boolean aceptada; // Indica si la oferta ha sido aceptada

    // Constructor para crear una oferta
    public Oferta(Cliente cliente, Pieza pieza, int cantidad) {
        this.cliente = cliente;
        this.pieza = pieza;
        this.cantidad = cantidad;
        this.aceptada = false; // Inicialmente, la oferta no está aceptada
    }

    // Métodos getters y setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isAceptada() {
        return aceptada;
    }

    public void setAceptada(boolean aceptada) {
        this.aceptada = aceptada;
    }

    // Método para actualizar la oferta
    public void actualizarOferta(int nuevaCantidad) {
        if (!aceptada) { // Solo se puede actualizar una oferta si no ha sido aceptada
            this.cantidad = nuevaCantidad;
        }
    }

    // Método para cancelar la oferta
    public void cancelarOferta() {
        if (!aceptada) { // Solo se puede cancelar una oferta si no ha sido aceptada
           
            this.aceptada = true; // Marcamos la oferta como "cancelada" cambiando su estado a aceptada
        }
    }
}
