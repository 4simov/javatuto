package tuto2.geom;


public class Triangle extends Figure {

    public int longueur;
    
    public Triangle(int longueur) {
        this.longueur = longueur;
    }
    
    @Override
    public double aire() {
        return longueur*longueur*Math.sqrt(3)/2;
    }
        
    
}
