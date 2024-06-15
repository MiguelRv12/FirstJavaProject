public class Bebida extends Producto implements Descuento,esAlimento {
    @Override
    public int rebaja() {
        return (int) (precio * 0.9);
    }

    @Override
    public int esUnAlimento() {
        System.out.println("Soy un alimento");
        return 100;
    }
}
