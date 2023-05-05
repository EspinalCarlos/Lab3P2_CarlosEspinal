
package lab3p2_carlosespinal;

import java.util.ArrayList;

public class Compra {
    private ArrayList<Producto> listadeproductos = new ArrayList();
    private double total;

    public Compra() {
    }

    public Compra(double total) {
        this.total = total;
    }

    public ArrayList<Producto> getListadeproductos() {
        return listadeproductos;
    }

    public void setListadeproductos(ArrayList<Producto> listadeproductos) {
        this.listadeproductos = listadeproductos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
    
    
    
}
