/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp45;

/**
 *
 * @author cp329243
 */
public class Triangle {
    public String sommet1, sommet2, sommet3;
    public int arete1, arete2, arete3;
    public double perimetre;
    public double aire;
    
    public Triangle ( String sommet1, String sommet2, String sommet3, int arete1, int arete2, int arete3, double perimetre, double aire ) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
        this.arete1 = arete1;
        this.arete2 = arete2;
        this.arete3 = arete3;
        this.perimetre = perimetre;
        this.aire = aire;
    }
    
}
