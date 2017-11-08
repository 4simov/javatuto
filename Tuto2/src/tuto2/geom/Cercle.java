package tuto2.geom;

public class Cercle extends Figure {

    public int rayon;
    
    public Cercle(int rayon) {
        
    }
    
    @Override
    public double aire() {
        return Math.PI*rayon*rayon;
    }
    
}
