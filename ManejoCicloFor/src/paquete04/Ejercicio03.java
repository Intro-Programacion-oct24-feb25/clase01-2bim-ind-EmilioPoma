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
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        for (int i = 1; i <= 5; i++) {
            for (int contador = 1; contador <= i; contador++) {

                System.out.printf("%s", "*");
            }
            System.out.println();
        }

        for (int n = 5; n >= 1; n--) {
            for (int contador_2 = 1; contador_2 <= n; contador_2++) {
                System.out.printf("%s", "*");
            }
            System.out.println();
        }

    }
}
