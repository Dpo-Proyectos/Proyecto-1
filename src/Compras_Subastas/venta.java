package Compras_Subastas;



import Inventario.Pieza; 

public class venta {
    private Pieza pieza;
    private int precioVenta;
    private boolean bloqueo;
    private int codigoVenta;

    // Constructor para inicializar una venta
    public venta(Pieza pieza, int precioVenta, int codigoVenta) {
        this.pieza = pieza;
        this.precioVenta = precioVenta;
        this.bloqueo = false; // Inicialmente, la pieza no está bloqueada
        this.codigoVenta = codigoVenta;
    }

    // Getter y setter para pieza
    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    // Getter y setter para precioVenta
    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    // Getter para bloqueo
    public boolean isBloqueo() {
        return bloqueo;
    }

    // No hay setter para bloqueo, en cambio, usaremos métodos específicos para cambiar este estado.

    // Getter y setter para codigoVenta
    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    // Métodos para manejar la venta
    public void bloquearPieza() {
        bloqueo = true;
    }

    public void desbloquearPieza() {
        bloqueo = false;
    }

    // Método  para confirmar la venta
    public void confirmarVenta() {
        if (!bloqueo) {
            bloquearPieza();
        }
       
    }

    public void cancelarVenta() {
        desbloquearPieza();

    }
}
