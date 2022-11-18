package Libros;

import java.util.Comparator;

public class GeneroComp implements Comparator<Libro> {

    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getGenero().compareTo(o2.getGenero());
    }

}
