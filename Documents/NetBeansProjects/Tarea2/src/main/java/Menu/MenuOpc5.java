/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import dll.Calculos;
import java.util.Scanner;

/**
 *
 * @author Alcira Salinas
 */
public class MenuOpc5 implements IMenu{

    Scanner scann = new Scanner(System.in);
    OMenu m = new OMenu();
    int op1, op2;
    
    @Override
    public void Opciones() {
        
        System.out.println("1. Generar numeros aleatorios");
        System.out.println("2. Sumar dos numeros");
        System.out.println("3. Volver al Menú principal");
        
    }

    @Override
    public void mostrar() {
        int op=0;
        do{
            System.out.println("");
            Opciones();
            op = scann.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("El número aleatorio es:");
                    System.out.println(Calculos.OtrosCalcRandom());
                    break;
                case 2:
                    System.out.println("Ingrese el primer número a sumar:");
                    op1= scann.nextInt();
                    System.out.println("Ingrese el segundo número a sumar:");
                    op2= scann.nextInt();
                    System.out.println("La suma de los dos números es:\n"+Calculos.SumarNumeros(op1, op2));
                    break;
                case 3:
                    m.mostrar();
                   break;
                default :
                    System.out.println("Opción invalida");
                    break;
                
            }
            
        }
        while(op!=0);
    }
 
    
}
