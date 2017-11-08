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
public class Disque {
    
    Point point;
    public int rayon;
    public double perimetre;
    public double aire;
    
    public Disque ( Point centre, int rayon ){
        this.point = centre;
        this.rayon = rayon;
        this.perimetre = 2*Math.PI*rayon;
        aire = Math.PI*rayon*rayon;
    }
    
}
