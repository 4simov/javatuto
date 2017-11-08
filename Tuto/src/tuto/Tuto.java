package tuto;

import pokemons.*;


public class Tuto {

    public static void main(String[] args) {
        Pickachu pickachu = new Pickachu("Pickachu", 100, 50);
        
        pickachu.attack();
        
        System.out.println(pickachu.MANA);
    }
    
}
