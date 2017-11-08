package tuto1;

import java.util.ArrayList;
import java.util.List;

public class Tuto1 {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("Salut");
        list.add("Bonjour");
        
        for (String sss : list)
            System.out.println(sss);
    }
    
}
