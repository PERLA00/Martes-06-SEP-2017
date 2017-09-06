/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author perla
 */
public class actividades {
    Scanner leer = new Scanner(System.in);
    public void dados(){
    
        System.out.println("----DADOS-----");
        Random r1 = new Random();
        int dado1 = r1.nextInt(6) + 1;
        int dado2 = r1.nextInt(6) + 1;
        int dado3 = r1.nextInt(6) + 1;
    
        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(dado3);
    
        if(dado1==6&&dado2==6&&dado3==6){
            System.out.println("--EXCELENTE--");
        }
        else if(dado1==6&&dado2==6||dado1==6&&dado3==6||dado2==6&&dado3==6){
            System.out.println("--MUY BIEN--");
        }
        else if(dado1==6||dado2==6||dado3==6){
            System.out.println("--REGULAR--");
        }  
        else{
            System.out.println("--PESIMO--");
    }
    
    }//Cierra void dados 1
    
    public void mayores(){
        int valor=0;
        int suma=0;
        int intentos=0;
        int max=5;
        
        System.out.println("---Ejercicio 2---");

        do{
        System.out.print("Ingrese un valor: ");
        valor = leer.nextInt();
          if(valor>=20){
            suma=suma+valor;
        }
            if (valor%2==0){
            intentos++;
            }
        }while(intentos<max);
        System.out.print("La suma es:"+suma);
        
    }//Cierra ejercicio 2
    
    public void multi(){
        System.out.println("----Ejercicio 3----");
        
        Random r2 = new Random();
        int multi= r2.nextInt(10)+1;
        int multi2 =r2.nextInt(10)+1;
        int resultado=0, result=0,i=0, max=5;
     
        resultado=multi*multi2;
        System.out.println("Resuelva la Siguiente multiplicacion");
        System.out.println("    ---"+multi + "*" + multi2+"---");
        
         do{ 
            System.out.print("¿Cual es la respuesta?: ");
            result = leer.nextInt();
            
            if(result == resultado){
            System.out.println("CORRECTO");
            max=0;
            }else{
             i++;
            }
         }while(i<max); 
         System.out.println("El resultado es: "+ resultado); 
   
    }//Fin multiplicacion 3
    
    public void adivinanza(){
        System.out.println("----Ejercicio 5----");
        System.out.println("Adivina el Numero");
        Random r3=new Random();
        
        int numero=r3.nextInt(100)+1;
        int adivinar=0;
        
        System.out.print("Ingresa un numero: ");
        adivinar=leer.nextInt();
        
        while(numero!=adivinar){
            
          if(adivinar<numero){
              System.out.print("Ingresa un numero mayor: ");
              
          }else{
              System.out.print("Ingresa un numero menor: ");
          }
          adivinar=leer.nextInt();
        }
        System.out.println("ADIVINASTE");
        
    }//fin adivinanza 5
    
    
    //-----Ejercicio 6
    public void tarjeta(){
        int deuda=6000;
        double interes=0.15;
        double resultado=0;
        
        resultado = deuda * interes;
        
        
        
    }//fin de tarjeta 6
    
}//Cierra la clase
