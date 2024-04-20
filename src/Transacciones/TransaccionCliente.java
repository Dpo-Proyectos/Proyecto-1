package Transacciones;

import java.io.Serializable;

public class TransaccionCliente extends Transaccion implements Serializable {
    private static final long serialVersionUID = 1L;  
    private int idCliente;

    public TransaccionCliente(MetodoPago metodoPago, int cantidad, int idCliente) {
        super(metodoPago, cantidad);
        this.idCliente = idCliente;
    }

   
    @Override
    public boolean realizarTransaccion() {
        System.out.println("Procesando transacción para cliente ID: " + idCliente);
        return super.realizarTransaccion();
    }
}