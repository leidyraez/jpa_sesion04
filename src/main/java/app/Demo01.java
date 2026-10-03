package app;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class Demo01 {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto(1, "Laptop", 2500.00));
        productos.add(new Producto(2, "Mouse", 50.00));
        productos.add(new Producto(3, "Teclado", 120.00));

        System.out.println("----- LISTADO DE PRODUCTOS -----");

        for (Producto producto : productos) {

            System.out.println(
                producto.getId() + " - " +
                producto.getNombre() + " - S/ " +
                producto.getPrecio()
            );
        }
    }
}
