package Transacciones;
import java.io.Serializable;

public class TransferenciaElectronica extends MetodoPago {
    private String usuario;
    private int pin;
    private int cantidad;

    public TransferenciaElectronica(String usuario, int pin, int cantidad) {
        this.usuario = usuario;
        this.pin = pin;
        this.cantidad = cantidad;
    }

    @Override
    public boolean realizarPago(int cantidad) {
        
        System.out.println("Realizando transferencia electrónica de: " + cantidad);
        return true;
    }
}