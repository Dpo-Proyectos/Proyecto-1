package Transacciones;
import java.util.Date;
import java.io.Serializable;

public class TarjetaCredito extends MetodoPago {
    private int numero;
    private Date fechaCaducidad;
    private int codigoSeguridad;

    public TarjetaCredito(int numero, Date fechaCaducidad, int codigoSeguridad) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public boolean realizarPago(int cantidad) {
        if (new Date().before(fechaCaducidad)) {
            System.out.println("Pagando con tarjeta de crédito: " + cantidad);
            return true;
        } else {
            System.out.println("La tarjeta de crédito ha expirado.");
            return false;
        }
    }
}