package tuto2.geom;


public class Carre extends Figure {

    public int longueur;
    
    public Carre(int longueur) {
        this.longueur = longueur;
    }
    
    @Override
    public double aire() {
        return longueur*longueur;
    }
    
}
