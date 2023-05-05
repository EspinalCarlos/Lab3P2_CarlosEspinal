
package lab3p2_carlosespinal;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Lab3P2_CarlosEspinal {
    
    static ArrayList lista = new ArrayList();
    static Scanner read = new Scanner(System.in);
    
    public static void menu1(){
        System.out.println("""
                           --- Menu Principal ---
                           
                           1. Agregar comida
                           2. Agregar Bebida
                           3. Modificar productos
                           4. Eliminar producto
                           5. Listar productos
                           6. Generar compra
                           7. Registro de compras
                           8. Salida
                           
                           
                           """);
    }
    
    public static void menuDel(){
        System.out.println("""
                           --- Tipo de Producto a eliminar ---
                           
                           1. Comida
                           2. Bebida
                           
                           
                           """);
    }
    
    public static void menuList(){
        System.out.println("""
                           --- Tipo de Producto a listar ---
                           
                           1. Comida
                           2. Bebida
                           
                           
                           """);
    }
    
    public static void menuMod1(){
        System.out.println("""
                           --- Tipo de Producto a modificar ---
                           
                           1. Comida 
                           2. Bebida
                           
                           """);
    }
    
    public static void menuModC(){
        System.out.println("""
                           --- Atributo a modificar ---
                           
                           1. Nombre
                           2. Precio
                           3. Estado de Vencimiento
                           
                           
                           """);
    }
    public static void menuModB(){
        System.out.println("""
                           --- Atributo a modificar ---
                           
                           1. Nombre
                           2. Precio
                           3. Size 
                           
                           """);
    }
    public static void main(String[] args) {
        int op0 = 0;
        while (op0 != 8) {            
            menu1();
            System.out.println("Ingrese la opcion que desea utilizar: ");
            int opc1 = read.nextInt();
            
            switch(opc1){
                case 1:
                    System.out.println("Ingrese el nombre de la comida: ");
                    read.nextLine();
                    String namec = read.nextLine();
                    System.out.println("Ingrese el precio de la comida: ");
                    double pricec = read.nextDouble();
                    System.out.println("Esta vencida esta comida?[S/N] ");
                    char ync = read.next().charAt(0);
                    boolean isV = true;
                    if (ync == 'S' || ync == 's') {
                        isV = true;
                    } else{
                        isV = false;
                    }
                    
                    lista.add(new Comida(isV, namec, pricec));
                    JOptionPane.showMessageDialog(null, "Agregado correctamente");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la bebida: ");
                    read.nextLine();
                    String nameb = read.nextLine();
                    System.out.println("Ingrese el precio de la bebida: ");
                    double priceb = read.nextDouble();
                    System.out.println("Ingrese el size de la bebida: ");
                    int tamb = read.nextInt();
                    
                    lista.add(new Bebida(tamb, nameb, priceb));
                    break;
                    
                case 3:
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Lista vacia");
                    } else{
                        menuMod1();
                        int opcmod1 = read.nextInt();
                        switch(opcmod1){
                            case 1:
                                ArrayList<Integer> valmod = new ArrayList();
                                System.out.println("--- Lista de Comidas --- ");
                                for (Object t : lista) {
                                    if (t instanceof Comida) {
                                        System.out.println(lista.indexOf(t)+"- "+t+"\n");
                                        valmod.add(lista.indexOf(t));
                                    } 

                                }
                                System.out.println("Ingrese el indice de la comida que desea modificar: ");
                                int modind = read.nextInt();
                                if (!valmod.contains(modind)) {
                                    boolean cont = true;
                                        while(cont){
                                            JOptionPane.showMessageDialog(null, "Opion Invalida");
                                            System.out.println("Ingrese el indice de la comida que desea modificar: ");
                                            modind = read.nextInt();
                                            if (!valmod.contains(modind)) {
                                                cont = true;
                                            } else{
                                                cont = false;
                                            }
                                        }
                                }
                                
                                menuModC();
                                System.out.println("Ingrese el atributo a modificar: ");
                                int atrmodcum = read.nextInt();
                                switch (atrmodcum){
                                    case 1:
                                        System.out.println("Ingrese el nuevo nombre: ");
                                        read.nextLine();
                                        String newnamec = read.nextLine();
                                        
                                        ((Comida)lista.get(modind)).setNombre(newnamec);
                                        JOptionPane.showMessageDialog(null, "Modificado correctamente");
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo precio: ");
                                        double newpricec = read.nextDouble();
                                        ((Comida)lista.get(modind)).setPrecio(newpricec);
                                        JOptionPane.showMessageDialog(null, "Modificado correctamente");
                                        break;
                                    case 3: 
                                        System.out.println("La comida esta vencida[S/N] ");
                                        char newyn = read.next().charAt(0);
                                        
                                        if (newyn == 's' || newyn == 'S') {
                                            ((Comida)lista.get(modind)).setEstadoVencimiento(true);
                                            JOptionPane.showMessageDialog(null, "Modificado correctamente");
                                        } else{
                                            ((Comida)lista.get(modind)).setEstadoVencimiento(false);
                                            JOptionPane.showMessageDialog(null, "Modificado correctamente");
                                        }
                                        break;
                                }
                                
                                
                                
                                break;
                            case 2:
                                ArrayList<Integer> valmod2 = new ArrayList();
                                System.out.println("--- Lista de Bebidas --- ");
                                for (Object t : lista) {
                                    if (t instanceof Bebida) {
                                        System.out.println(lista.indexOf(t)+"- "+t+"\n");
                                        valmod2.add(lista.indexOf(t));
                                    } 

                                }
                                System.out.println("Ingrese el indice de la bebida que desea modificar: ");
                                int modindb = read.nextInt();
                                if (!valmod2.contains(modindb)) {
                                    boolean cont = true;
                                        while(cont){
                                            JOptionPane.showMessageDialog(null, "Opion Invalida");
                                            System.out.println("Ingrese el indice de la bebida que desea modificar: ");
                                            modindb = read.nextInt();
                                            if (!valmod2.contains(modindb)) {
                                                cont = true;
                                            } else{
                                                cont = false;
                                            }
                                        }
                                }
                                
                                menuModB();
                                int indmodbeb= read.nextInt();
                                
                                switch(indmodbeb){
                                    case 1:
                                        System.out.println("Ingrese el nuevo nombre: ");
                                        read.nextLine();
                                        String newnamec = read.nextLine();
                                        
                                        ((Bebida)lista.get(modindb)).setNombre(newnamec);
                                        JOptionPane.showMessageDialog(null, "Modificado correctamente");
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo precio: ");
                                        double newpricec = read.nextDouble();
                                        ((Bebida)lista.get(modindb)).setPrecio(newpricec);
                                        JOptionPane.showMessageDialog(null, "Modificado correctamente");
                                        break;
                                    case 3:
                                        System.out.println("Ingrese el nuevo size: ");
                                        int newsize = read.nextInt();
                                        ((Bebida)lista.get(indmodbeb)).setSize(newsize);
                                        break;
                                }
                                
                                
                                break;
                        }
                        
                    }
                    break;
                    
                case 4:
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Lista vacia");
                    } else {
                        menuDel();
                        int opcdel = read.nextInt();
                        switch (opcdel){
                            case 1:
                                ArrayList<Integer> valdel = new ArrayList();
                                System.out.println("--- Lista de Comidas --- ");
                                for (Object t : lista) {
                                    if (t instanceof Comida) {
                                        System.out.println(lista.indexOf(t)+"- "+t+"\n");
                                        valdel.add(lista.indexOf(t));
                                    } 

                                }
                                System.out.println("Ingrese el indice de la comida que desea eliminar: ");
                                int delind = read.nextInt();
                                if (!valdel.contains(delind)) {
                                    boolean cont = true;
                                        while(cont){
                                            JOptionPane.showMessageDialog(null, "Opion Invalida");
                                            System.out.println("Ingrese el indice de la comida que desea eliminar: ");
                                            delind = read.nextInt();
                                            if (!valdel.contains(delind)) {
                                                cont = true;
                                            } else{
                                                cont = false;
                                            }
                                        }
                                }
                                lista.remove(delind);
                                JOptionPane.showMessageDialog(null, "Eliminado correctamente");
                                break;
                            case 2:
                                ArrayList<Integer> valdel2 = new ArrayList();
                                System.out.println("--- Lista de Bebidas --- ");
                                for (Object t : lista) {
                                    if (t instanceof Bebida) {
                                        System.out.println(lista.indexOf(t)+"- "+t+"\n");
                                        valdel2.add(lista.indexOf(t));
                                    } 

                                }
                                System.out.println("Ingrese el indice de la bebida que desea eliminar: ");
                                    int delind2 = read.nextInt();

                                    if (!valdel2.contains(delind2)) {
                                        boolean cont = true;
                                        while(cont){
                                            JOptionPane.showMessageDialog(null, "Opion Invalida");
                                            System.out.println("Ingrese el indice de la bebida que desea eliminar: ");
                                            delind2 = read.nextInt();
                                            if (!valdel2.contains(delind2)) {
                                                cont = true;
                                            } else{
                                                cont = false;
                                            }
                                        }
                                    }
                                    lista.remove(delind2);
                                    JOptionPane.showMessageDialog(null, "Eliminado correctamente");


                                break;
                        }
                    }
                    break;
                case 5:
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Lista vacia");
                    } else{
                        menuList();
                        int alist = read.nextInt();

                        switch(alist){
                            case 1: 
                                System.out.println("--- Lista de Comidas ---");
                                for (Object t : lista) {
                                    if (t instanceof Comida) {
                                        System.out.println(lista.indexOf(t)+"- "+t+"\n");
                                    }
                                }
                                break;

                            case 2:
                                System.out.println("--- Lista de Bebidas ---");
                                for (Object t : lista) {
                                    if (t instanceof Bebida) {
                                        System.out.println(lista.indexOf(t)+"- "+t+"\n");
                                    }
                                }


                                break;
                        }
                    }
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    op0=8;
                    break;
            }
        }
        
        
        
    }
    
}
