import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos: ");
        int numProductos = scanner.nextInt();

        for (int i = 1; i <= numProductos; i++) {
            System.out.println("\nProducto #" + i);
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.next();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            tienda.agregarProducto(nombre, precio);
        }

        System.out.println("\nEl total a pagar es: $" + tienda.calcularTotal());
    }
}