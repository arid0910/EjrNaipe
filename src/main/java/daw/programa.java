/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String menu = """
                      -----------------------------------------
                      Introduce una opcion:
                      -----------------------------------------
                       - 1 = Crear carta aleatoria
                       - 2 = Crear baraja
                       - 3 = Juego de cartas
                      -----------------------------------------
                      """;
        System.out.println(menu);
        int opcion = sc.nextInt();

        Naipes porDefecto = new Naipes();

        switch (opcion) {

            case 1 -> {
                      System.out.println(Baraja.cartaAleatoria(porDefecto));
            }
            
            case 2 -> {

            }
            
            case 3 -> {

            }

        }
    }
}
