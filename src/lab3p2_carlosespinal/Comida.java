
package lab3p2_carlosespinal;


public class Comida extends Producto{
    private boolean estadoVencimiento;

    public Comida() {
        super();
    }

    public Comida(boolean estadoVencimiento, String nombre, double precio) {
        super(nombre, precio);
        this.estadoVencimiento = estadoVencimiento;
    }

    public boolean isEstadoVencimiento() {
        return estadoVencimiento;
    }

    public void setEstadoVencimiento(boolean estadoVencimiento) {
        this.estadoVencimiento = estadoVencimiento;
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
        if (estadoVencimiento == true) {
            return super.toString() + "El producto ha vencido";
        } else{
            return super.toString() + "El producto no ha vencido";
        }
        
    }
    
    
    
    
    
}
