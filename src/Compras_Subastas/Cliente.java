package Compras_Subastas;

import Inventario.Pieza;
import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String usuario;
    private String contrasena;
    private int codigoCliente;
    private List<Pieza> piezasPropias;

    // Constructor
    public Cliente(String usuario, String contrasena, int codigoCliente) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.codigoCliente = codigoCliente;
        this.piezasPropias = new ArrayList<>();
    }

    // Métodos para iniciar y cerrar sesión
    public void iniciarSesion(String usuario, String contrasena) {
    
    }

    public void cerrarSesion() {
      
    }

    // Métodos para manejar las piezas del cliente
    public void entregarPiezaExhibicion(Pieza pieza) {
     
    }

    public void entregarPiezaVenta(Pieza pieza, int precio) {
      
    }

    public void entregarPiezaSubasta(Pieza pieza, int precioMinimo) {
        // Lógica para entregar una pieza para subasta
    }

    // Métodos para realizar ofertas
    public void realizarOfertaVenta(MetodoPago metodoPago) {
     
    }

    public void realizarOfertaSubasta() {
       
    }

    // Getters y setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getontrasena() {
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public List<Pieza> getPiezasPropias() {
        return new ArrayList<>(piezasPropias);
    }

    public void agregarPiezaPropia(Pieza pieza) {
        this.piezasPropias.add(pieza);
    }
}
