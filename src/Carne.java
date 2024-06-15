public class Carne extends Producto implements Descuento,esAlimento {
    @Override
    public int rebaja() {
        return (int) (precio * 0.8);
    }

    @Override
    public int esUnAlimento() {
        System.out.println("Soy un alimento");
        return 150;
    }

    @Override
    public int getPrecio() {
        if (fechaCaducidad <= 2){
            return rebaja();
        }
        else {
            return super.getPrecio();
        }
    }
}
