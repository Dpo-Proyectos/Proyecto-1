package Transacciones;
import java.io.Serializable;

public class Efectivo extends MetodoPago {
    private int cantidad;

    public Efectivo(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean realizarPago(int cantidad) {
        System.out.println("Pagando en efectivo: " + cantidad);
        return true;
    }
}