package Inventario;
import java.util.List;
import java.util.ArrayList;


public class Galeria {
    private List<Pieza> inventario;

    public Galeria() {
        inventario = new ArrayList<>();
    }

    public void ingresarPiezaExhibicion(Pieza pieza) {
        // Añadir pieza al inventario para exhibición
        inventario.add(pieza);
    }

    public void registrarIngresoPiezaVenta(Pieza pieza, int precio) {
        // Registrar pieza para venta
        inventario.add(pieza);
        
    }

    public void registrarIngresoPiezaSubasta(Pieza pieza, int precioMinimo) {
        // Registrar pieza para subasta
        inventario.add(pieza);
        
    }

    // Método para consultar piezas en el inventario
    public List<Pieza> consultarInventario() {
        return new ArrayList<>(inventario);
    }
}

