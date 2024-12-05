/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author utpl
 */
public class Ejercicio02 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            entrada.useLocale(Locale.US);
            int contador = 0;
            double gradosF;
            double gradosC;
            String cadena = "";
       
            for(gradosF = 20; gradosF <= 100; gradosF += 4){
                gradosC = (5.0/9.0)*(gradosF - 32);
                cadena = String.format("%s\nOperación(%d) Fahrenheit: %.2f ===> Celcius: %.2f", cadena, contador, gradosF, gradosC);
                contador += 1;
           
           
          }
            System.out.println(cadena);
        
                    
               
            
            

        }
}
