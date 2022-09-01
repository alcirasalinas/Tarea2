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
public class MenuTemperatura implements IMenu {

    
    Scanner sc = new Scanner (System.in);
    int op =0;
    double op1;
    
    @Override
    public void Opciones() {
       
        System.out.println("Conversor de Temperatura");
        System.out.println("1.De celcius a farenheit");
        System.out.println("2.De farenheit a celsius");
        System.out.println("3.De celsius a kelvin");
        System.out.println("4.De kelvin a celsius");
        System.out.println("5.De farenheit a kelvin");
        System.out.println("6.De kelvin a fareheit");
        System.out.println("7.Volver ");
        
    }

    @Override
    public void mostrar() {
        
        do{
            System.out.println("");
            Opciones();
            op = sc.nextInt();
            
            switch(op){
                
                case 1:
                    System.out.println("Ingrese los grados:");
                    op1 = sc.nextDouble();
                    System.out.println(Calculos.CelsiusToFahr(op1));
                break;
                case 2:
                    System.out.println("Ingrese los grados:");
                    op1 = sc.nextDouble();
                    System.out.println(Calculos.FahrToCelsius(op1));
                break;
                case 3:
                    System.out.println("Ingrese los grados:");
                    op1 = sc.nextDouble();
                    System.out.println(Calculos.CelToKelvin(op1));
                break;
                case 4:
                    System.out.println("Ingrese los grados:");
                    op1 = sc.nextDouble();
                    System.out.println(Calculos.KelToCelsius(op1));
                break;
                case 5:
                    System.out.println("Ingrese los grados:");
                    op1 = sc.nextDouble();
                    System.out.println(Calculos.FahrToKel(op1));
                    
                break;
                case 6:
                    System.out.println("Ingrese los grados:");
                    op1 = sc.nextDouble();
                    System.out.println(Calculos.KelToFahr(op1));
                break;
                case 7:
                    OMenu m = new OMenu();
                    m.mostrar();     
                break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            
        } while(op!=0);
        
        
        
        
    
    }
    
    
    
}
