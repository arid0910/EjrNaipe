/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

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
                      """.formatted(numCarta,palo);
        return resu;
    }
}
