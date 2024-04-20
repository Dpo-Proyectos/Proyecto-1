package Compras_Subastas;

import Inventario.Pieza;




public class Administrador extends Trabajador {

    public Administrador(String usuario, String contrasena, boolean permisoEspecial) {
        super(usuario, contrasena, permisoEspecial);
    }

    public void entregarPiezaCliente(Pieza pieza, Cliente cliente) {
        // 
    }

    public void confirmarVenta(venta venta) {
        // 
    }

    public void autorizarCliente(Cliente cliente) {
        // 
    }
}