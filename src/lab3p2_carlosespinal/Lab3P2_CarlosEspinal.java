
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
                    String priceb = read.nextLine();
                    System.out.println("Ingrese el size de la bebida: ");
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
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
