/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio01 {
        public static void main(String[] args) {
            String cadena = "";
            for (int valor_1 = 30; valor_1 > 10; valor_1--){
                for (int valor_2 = 60; valor_2 > 10; valor_2 -= 2){
                    for (int valor_3 = 90; valor_3 > 10; valor_1 -= 3){
                        for (int valor_4 = 120; valor_4 > 10; valor_1 -=4){
                            cadena = String.format("%s%d-%d-%d-%d", cadena, valor_1, valor_2, valor_3, valor_4);
                        }
                    }
                }
            }
            System.out.println(cadena);

        }
}
