/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.Random;

/**
 *
 * @author adam
 */
public class Naipes {
    
    Random random = new Random();
    
    private int numCartas;
    private String palo; 
    
    int[] arrayNumCartas = {1,2,3,4,5,6,7,8,9,10};
    String[] arrayPalo = {"Oros","Bastos","Espadas","Copas"};
    
    public Naipes() {
        this.numCartas = arrayNumCartas[random.nextInt(10)];
        this.palo = arrayPalo[random.nextInt(4)];
    }

    public int getNumCartas() {
        return numCartas;
    }

    public void setNumCartas(int numCartas) {
        this.numCartas = numCartas;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naipes{");
        sb.append("numCartas=").append(numCartas);
        sb.append(", palo=").append(palo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
