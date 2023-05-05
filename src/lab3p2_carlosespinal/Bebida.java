
package lab3p2_carlosespinal;

public class Bebida extends Producto{
    private int Size;

    public Bebida() {
        super();
    }

    public Bebida(int Size, String nombre, double precio) {
        super(nombre, precio);
        this.Size = Size;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSize: " + Size;
    }
    
    
    
    
    
    
    
}
