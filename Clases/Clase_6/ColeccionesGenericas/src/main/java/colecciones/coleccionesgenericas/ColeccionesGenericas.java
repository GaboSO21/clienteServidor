package colecciones.coleccionesgenericas;

import java.util.*;

public class ColeccionesGenericas {

    public static void main(String[] args) {
        //coleccion no generica
         System.out.println("---------------------Colecciones no Genericas--------------------------------");
        ArrayList list = new ArrayList(10);
        list.add(10);
        list.add("hola");

        System.out.println(list);
        System.out.println(list.size());
        
        String prueba=(String)list.get(0);
        for (int i=0;i<list.size();i++)
        {
                System.out.println(list.get(i));
        }
        
        for (Object nl : list)
        {
            //System.out.println((Integer)nl+1);
        }

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        int total1 = ((Integer) list.get(0)) + 1;
        //int total2 = ((Integer) list.get(1)) + 1;

        System.out.println(total1);
        //System.out.println(total2);
        
        
        System.out.println("---------------------Colecciones Genericas--------------------------------");
       /* //coleccion no generica
        ArrayList<Integer> lista = new ArrayList();
        lista.add(10);
        lista.add(20);
        
        for (Integer nl : lista)
        {
            System.out.println(nl+1);
        }
        
        ArrayList<String> lista2 = new ArrayList();
        lista2.add("Hola");
        lista2.add("Como estas");
        String pueba2=lista2.get(1);
        for (Integer nl : lista2)
        {
            System.out.println(nl+1);
        }
*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        //coleccion no generica
        ArrayList<Integer> list2 = new ArrayList(10);
        list2.add(10);
        list2.add(20);
        for (Integer nl : list2) {
            System.out.println(nl);
        }*/
    }
}
