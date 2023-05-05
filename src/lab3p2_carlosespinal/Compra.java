
package lab3p2_carlosespinal;

import java.util.ArrayList;

public class Compra {
    private ArrayList<Producto> listadeproductos = new ArrayList();
    private int total;

    public Compra() {
    }

    public Compra(int total) {
        this.total = total;
    }

    public ArrayList<Producto> getListadeproductos() {
        return listadeproductos;
    }

    public void setListadeproductos(ArrayList<Producto> listadeproductos) {
        this.listadeproductos = listadeproductos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
    
    
    
    
}
