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
public class Segment {
    public String extremite1, extremite2;
    public int longueur;
    public int milieu;
    
    public Segment( String extremite1, String extremite2, int longueur, int milieu ){
        this.extremite1 = extremite1;
        this.extremite2 = extremite2;
        this.longueur = longueur;
        this.milieu = milieu;
    }
}
