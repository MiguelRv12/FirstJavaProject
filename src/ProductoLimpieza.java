public class ProductoLimpieza extends Producto implements Descuento{
    @Override
    public int rebaja() {
        return (int) (precio * 0.8);
    }
}
