/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author perla
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    actividades datos = new actividades();
    
    int opc=0;
    
    System.out.println("-----MENU-----");
    System.out.println("1. Dados");
    System.out.println("2. Numeros mayores que 20");
    System.out.println("3. Multiplicación aleatoria");
    System.out.println("4. Piramide");
    System.out.println("5. Juego de adivinanza");
    System.out.println("6. Ejercicio 6");
    System.out.print("Ingrese la opcion: ");
    opc = leer.nextInt();
    System.out.println("");
    
    switch(opc){
        case 1:
            datos.dados();
            break;
      
        case 2:
            datos.mayores();
            break;
        
        case 3:
            datos.multi();
            break;
            
        case 4:
           
            break;
        
        case 5:
            datos.adivinanza();
            break;
        
    }
    
    }
    
}
