import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductoManager productoManager = new ProductoManager();
        ArrayList<Producto> productos = new ArrayList<>();
        boolean continuar = true;
        String respuesta = "";
        int precioAlimentos = 0;
        int precioNoAlimentos = 0;


        while (continuar) {
            System.out.println("¿Qué tipo de producto desea crear? (bebida, carne o producto_de_limpieza)");
            String tipoProducto = scanner.nextLine().toLowerCase();

            // try if product exist
            try {
                Producto nuevoProducto =productoManager.crearProducto(tipoProducto);
                // Set nombre
                System.out.println("Introduce el nombre del producto: ");
                nuevoProducto.nombre = scanner.nextLine();
                // set precio
                System.out.println("Introduce el precio del producto: ");
                nuevoProducto.precio = Integer.parseInt(scanner.nextLine());
                // set caducidad
                System.out.println("Introduce la caducidad del producto: ");
                nuevoProducto.fechaCaducidad = Integer.parseInt(scanner.nextLine());
                System.out.println("Has creado un producto de tipo " + tipoProducto + " con nombre " + nuevoProducto.getNombre() + ", precio " + nuevoProducto.getPrecio() + "$ y fecha de caducidad " + nuevoProducto.getFechaCaducidad());
                productos.add(nuevoProducto);
            } catch (TipoProductoNoReconocidoException e) {
                System.out.println(e.getMessage());
            }
            while(!respuesta.equals("Y") && !respuesta.equals("N")){
                System.out.println("¿Desea continuar con el programa? (Y/N)");
                respuesta = scanner.nextLine().toUpperCase();
                if (respuesta.equals("N")) {
                    continuar = false;
                }
            }
            respuesta = "";
        }

        for (Producto producto : productos){
            if (producto instanceof esAlimento) {
                precioAlimentos += producto.getPrecio();
            } else {
                precioNoAlimentos += producto.getPrecio();
            };
        };
        System.out.println("Precio alimentos: " + precioAlimentos);
        System.out.println("Precio no alimentos: " + precioNoAlimentos);

        scanner.close();
        System.out.println("Programa finalizado.");
    }
}


