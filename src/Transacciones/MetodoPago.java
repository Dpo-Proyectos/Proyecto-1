package Transacciones;
import java.io.Serializable;
public abstract class MetodoPago  {
	public abstract boolean realizarPago(int cantidad);
}