package tuto2;

import java.util.ArrayList;
import java.util.List;
import tuto2.geom.*;

public class Tuto2 {


    public static void main(String[] args) {
        Cercle cercle = new Cercle(5);
        Carre carre = new Carre(10);
        Triangle triangle = new Triangle(7);
        
        List<Figure> list = new ArrayList<>();
            list.add(cercle);
            list.add(carre);
            list.add(triangle);
            
        double somme = 0;    
        for (Figure f : list)
            somme += f.aire();
        
        System.out.println(somme);
    }
    
}
