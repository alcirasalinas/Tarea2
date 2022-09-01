package dll;

import Menu.OMenu;
import static java.lang.Math. *;
import java.util.Scanner;

/**
 *
 * @author Alcira Salinas
 */
public class Calculos {

    
    public Calculos() {
    }

    public static double MRU(double d, double t) 
         {
         System.out.println("La velocidad de un proyectil MRU es de:");
         return d/t;
        
         }  
    public static double AlturaMaxima(double velocidad, double angGrado){
        double AltFin;
        double angRadian = Math.toRadians(angGrado);
        double altMax1 = Math.pow(velocidad, 2);
        double altMax2;
        altMax2 = Math.pow(Math.sin(angRadian),2);
        double altMaxM = altMax1 * altMax2;
        System.out.println("La altura máxima de un proyectil con trayectoria parabolica es de:");
        return AltFin = altMaxM/(9.8*2);
        
    }
    public static String NumeroPrimo(int numero)
    {
        
        try{
        if (numero == 0 || numero==1 || numero ==4)
        {
            System.out.println("El número ingresado no es un número primo");
        }
        
        for(int i=2; i<numero;i++)
        {
            if (numero % i == 0)
            {
                return "El número ingresado no es número primo";
            }
            }
                
             return "El número ingresado es un número primo";
             
        }
             catch(Exception e)
                {
                return e.getMessage();
                }
             
         }
        public static int factorial(int numero)
            {
                
          int fact=1;      
          for (int i=1; i<=numero;i++)
          { 
          fact = fact *i;
                 
          }
            return fact;
            
            }
        public static int OtrosCalcRandom()
        {
            int aleatorio = 0;
            aleatorio = (int) (Math.random()*10000);
        return aleatorio;
            
        }
        public static int SumarNumeros(int a, int b){
            
            int sumar = a+b;
            System.out.println("La suma de ambos numeros es:");
            return sumar;
   
        }
        public void DeciToBin (int numero)
        {
         
        int exp, digito;
        double binario;
        Scanner sc = new Scanner(System.in);

        do{ 
            System.out.print("Introduzca un número entero:");                                                
            numero = sc.nextInt();
        }while(numero < 0);

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;           
                binario = binario + digito * Math.pow(10, exp);                                                   
                exp++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
        
        }
        
 
        
        public static double CelsiusToFahr(double gradosCel)
        
        {
            double gradoFar = (gradosCel *1.8)+32;
            
        return gradoFar;
            
        }
        public static double FahrToCelsius(double gradosFahr)
        
        {
            double gradoCel = (gradosFahr -32)*0.55;
            
        return gradoCel;
            
        }
        
         public static double CelToKelvin(double gradosCel)
        
        {
            double gradoKel = gradosCel * 273.15;
            
             return gradoKel;
            
        }
         public static double KelToCelsius(double gradosKel)
        
        {
            double gradosCel = gradosKel - 273.15;
            
             return gradosCel;
            
        }
         
         public static double FahrToKel(double gradosFahr)
        
        {
            double gradosKel = (gradosFahr - 32)*0.55 + 273.15;
            
             return gradosKel;
            
        }
          public static double KelToFahr(double gradosKel)
        
        {
            double gradosFahr = (gradosKel - 237.15)*1.8 + 32;
            
             return gradosFahr;
            
        } 
    }
    
    
    
    
    
      
