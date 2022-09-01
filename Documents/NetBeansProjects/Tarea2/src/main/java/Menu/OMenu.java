/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import com.sun.javafx.css.CalculatedValue;
import dll.Calculos;
import main.main;
import java.util.Scanner;

/**
 *
 * @author Alcira Salinas
 */

public class OMenu implements IMenu {
    
    private Scanner scan = new Scanner(System.in);
    int op1, op2;
    

    @Override
    public void Opciones() {
    System.out.println("Gestión de programas");
        System.out.println("1.Velocidad en MRU");
        System.out.println("2.Altura Max(Proyectil)");
        System.out.println("3.Numero primo");
        System.out.println("4.Factorial de un Numero");
        System.out.println("5.Otros cálculos");
        System.out.println("6.Decimal a Binario");
        System.out.println("7.Conversor de Temperatura");
        System.out.println("8.Salir");    
        System.out.println("Ingrese una opción del menú mostrado\n");  
    
    }

    @Override
    public void mostrar() {
       
    int opc=0;
        
        do{
            System.out.println("");
            Opciones();
            System.out.println("");
            opc = scan.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("Ingrese la distancia:");
                    op1= scan.nextInt();
                    System.out.println("Ingrese el tiempo:");
                    op2= scan.nextInt();
                    System.out.println(Calculos.MRU(op1,op2));
                    break;
                case 2:
                    
                    System.out.println("Ingrese la velocidad inicial: ");
                    op1= scan.nextInt();
                    System.out.println("Ingrese el ángulo a evaluar: ");
                    op2= scan.nextInt();
                    Double entrada1 = Double.valueOf(op1);
                    Double entrada2 = Double.valueOf(op2);
                    System.out.println(Calculos.AlturaMaxima(entrada1, entrada2));
                   
                    break; 
                    
                case 3:
                    System.out.println("Ingrese un numero:");
                    op1 = scan.nextInt();
                    System.out.println(Calculos.NumeroPrimo(op1));
                    break; 
                case 4:
                    System.out.println("Ingrese un número:");
                    op1 = scan.nextInt();
                    System.out.println(Calculos.factorial(op1));
                    break;
                case 5:
                    MenuOpc5 subm = new MenuOpc5();
                    subm.mostrar();
                    break;
                case 6:
                    Calculos d = new Calculos();
                    d.DeciToBin(op1);
                    break;
                case 7:
                    MenuTemperatura m = new MenuTemperatura();
                    m.mostrar();
                    break;
                case 8:
                    System.out.println("Usted está saliendo del programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;  
            }
            
        } 
        while(opc!=0);
      } 
     } 
 
