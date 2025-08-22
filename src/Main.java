import javax.crypto.spec.PSource;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashSet<Producto> productos = new HashSet<>();
        Producto producto1 = new Producto("Coca Cola 2lts", "Coca Cola grande sabor original, descartable");
        Producto producto2 = new Producto("Azúcar Ledesma 1kg", "Azúcar Ledesma 1kg primera calidad");
        Producto producto3 = new Producto("Facturas x6", "Facturas envadadas por media docena, elaboración propia");
        Producto producto4 = new Producto("Pan de Pancho La Española", "Pan de pancho La Española pro 6 unidades");
        Producto producto5 = new Producto("Fernet Branca 750ml", "Fernet Branca grande");

        System.out.println("Agregando productos");
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        System.out.println("Intentando agregar productos repetidos");
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        System.out.println("Productos en el HashSet");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}