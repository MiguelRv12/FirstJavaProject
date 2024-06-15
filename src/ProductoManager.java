public class ProductoManager {
    public Producto crearProducto(String tipoProducto) throws TipoProductoNoReconocidoException {
        Producto nuevoProducto;
        switch (tipoProducto) {
            case "bebida":
                System.out.println("Has seleccionado crear una bebida.");
                nuevoProducto= new Bebida();
                break;
            case "carne":
                System.out.println("Has seleccionado crear carne.");
                nuevoProducto= new Carne();
                break;
            case "producto_de_limpieza":
                System.out.println("Has seleccionado crear un producto de limpieza.");
                nuevoProducto = new ProductoLimpieza();
                break;
            default:
                throw new TipoProductoNoReconocidoException("Tipo de producto no reconocido: " + tipoProducto);
        }

        return nuevoProducto;
    }
}
