import java.util.ArrayList;
import java.util.Scanner;
public class Tienda {
    private ArrayList<Producto> productos;

    public Tienda() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, double precio) {
        Producto producto = new Producto(nombre, precio);
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}
