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
public class Baraja {

    public static String cartaAleatoria(Naipes n) {

        int numCarta = n.getNumCartas();
        String palo = n.getPalo();
        String resu = """
                      Tu carta es:
                       - Nº carta ->%s
                       - Palo ->%s
                      """.formatted(numCarta, palo);
        return resu;
    }

    public static String cartaAElegir(Naipes n) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un nº de carta");
        int numCarta = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce un palo");
        String palo = sc.nextLine();

        int numCartaAle;
        String paloAle;
        String resu;
        do {
            numCartaAle = n.getNumCartas();
            paloAle = n.getPalo();
            resu = """
                      Tu carta es:
                       - Nº carta ->%s
                       - Palo ->%s
                      """.formatted(numCartaAle, paloAle);
        } while (numCartaAle == numCarta && paloAle.equalsIgnoreCase(palo));

        return resu;
    }
}
