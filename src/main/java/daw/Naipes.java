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

    public Naipes(int numCartas, String palo) {
        this.numCartas = numCartas;
        if (numCartas < 1 || numCartas > 10){
            throw new IllegalArgumentException("Introduce un numero entre 1 y 10");
        }
        this.palo = palo;
        if (palo.equalsIgnoreCase("oros")||
            palo.equalsIgnoreCase("espadas")||
            palo.equalsIgnoreCase("copas")||
            palo.equalsIgnoreCase("bastos")) {
        
        }else{
             throw new IllegalArgumentException("Introduce -> Oros, Espadas , Copas o Basatos");
        }
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
