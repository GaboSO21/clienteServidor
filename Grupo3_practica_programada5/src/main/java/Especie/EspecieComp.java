package Especie;

import java.util.Comparator;

public class EspecieComp implements Comparator<Especies>{

    @Override
    public int compare(Especies o1, Especies o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
    
}
