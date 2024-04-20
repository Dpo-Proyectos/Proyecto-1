package Transacciones;
import java.io.Serializable;
public class Transaccion {
    private int cantidad;
    private boolean validez;
    private MetodoPago metodoPago;

    public Transaccion(MetodoPago metodoPago, int cantidad) {
        this.metodoPago = metodoPago;
        this.cantidad = cantidad;
      
    }

    public boolean realizarTransaccion() {
       
        if (metodoPago.realizarPago(cantidad)) {
            System.out.println("Transacción realizada con éxito.");
            return true;
        } else {
            System.out.println("Error al procesar el pago. Transacción no válida.");
            return false;
        }
    }
}