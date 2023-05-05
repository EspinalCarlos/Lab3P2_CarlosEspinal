
package lab3p2_carlosespinal;

import java.util.ArrayList;

public class Compra {
    private ArrayList<Producto> compras = new ArrayList();
    private int total;

    public Compra() {
    }

    public Compra(int total) {
        this.total = total;
    }

    public ArrayList<Producto> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Producto> compras) {
        this.compras = compras;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
    
}
