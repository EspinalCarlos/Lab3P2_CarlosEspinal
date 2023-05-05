
package lab3p2_carlosespinal;

import java.util.ArrayList;
import java.util.Scanner;


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
                    break;
                case 2:
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
