package clase5.colecciones;

import java.util.*;

public class Colecciones {

    public static void main(String[] args) {
        //Utilizando la interfaz SET
        //En SET los duplicados no son permitidos por lo tanto los mismos no son incluidos. 
        //No es una coleccion ordenada.
        Set set = new HashSet();
        set.add("primero");
        set.add("segundo");
        set.add("tercero");
        set.add(4);
        set.add(0.5f);
        set.add("segundo");
        set.add(4);
        //podemos imprimir la lista completa 
        System.out.println("Coleccion HasSet");
        System.out.println(set);

        //Para elimnar se pasa como parametro el objeto que se desea eliminar 
        set.remove("tercero");
        set.remove("primero");
        System.out.println("\n Coleccion HasSet despues de eliminar");
        System.out.println(set);

        //para recorrer la coleccion se puede realizar por medio de un iterador:
        Iterator<Integer> it = set.iterator();
        System.out.println("\n Imprimiendo 1 a 1 ...");
        //Mientras haya un elemento siguiente
        while (it.hasNext()) {
            // con .next obtenemos el valor
            // imprime el valor que contiene la coleccion HashSet 
            System.out.print(it.next() + "\n");
        }

        //Limpiar toda la lista
        set.clear();
        
        
        //Utilizando la interfaz LIST
        //En LIST los duplicados son permitidos por lo tanto los mismos si son incluidos al imprimir. 
        //Las listas contiene elementos ordenados, es decir se muestran en el orden que fueron introducidos
        List list = new ArrayList();
        list.add("primero");
        list.add("segundo");
        list.add("tercero");
        list.add(4);
        list.add(0.5f);
        list.add("segundo");
        list.add(4);
        System.out.println("Coleccion List");
        System.out.println(list);

        //Para eliminar se debe enviar como parametro el indice del elemento que se desea eliminar.
        list.remove(3);
        list.remove(1);
        System.out.println("Imprimiendo Coleccion List despues de eliminar");
        System.out.println(list);

        //recorriendo las listas
        //con un iterador
        Iterator<Integer> it2 = list.iterator();
        System.out.println("\n Imprimiendo 1 a 1 desde la lista con iterador...");
        //Mientras haya un elemento siguiente
        while (it2.hasNext()) {
            // con .next obtenemos el valor
            // imprime el valor que contiene la coleccion Lista 
            System.out.print(it2.next() + "\n");
        }

        System.out.println("Recorriendo la lista segun su tamaño...");
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }

        list.clear();
        
        ///// Utilizanddo HashMap
        System.out.println("************************HashMap*****************************");
        //Se agrega al HashMap con la sentencia put
        HashMap<Integer, String> studentHashMap = new HashMap();
        studentHashMap.put(101, "Nicole");
        studentHashMap.put(104, "Jose");
        studentHashMap.put(103, "Kevin");
        studentHashMap.put(105, "Kevin");
        studentHashMap.put(102, "Ana");
        //studentHashMap.put("Primero", "Susan");

        System.out.println(studentHashMap);

        //Para eliminar de una coleccion HashMap se le envia como parametro la clave que se desea eliminar
        studentHashMap.remove(102);
        studentHashMap.remove(101);

        System.out.println("Imprimiendo HashMap despues de eliminar.");
        System.out.println(studentHashMap);

        //Recorriendo un HashMap con iterador
        Iterator<Integer> it3 = studentHashMap.keySet().iterator();
        System.out.println("Imprimiendo HashMap uno a uno con iterador");
        while (it3.hasNext()) {
            Integer clave = it3.next();
            String valor = studentHashMap.get(clave);
            System.out.println("Clave: " + clave + ", valor: " + valor);
        }

        //Recorriendo un HashMap con for mejorado
        System.out.println("Recorrer las claves");
        for (Integer clave : studentHashMap.keySet()) {
            String valor = studentHashMap.get(clave);
            System.out.println("Clave: " + clave + ", valor: " + valor);
        }
studentHashMap.clear();

        System.out.println("********************* Utilizando TreeSet********************************\n");

        TreeSet studentSet = new TreeSet();
        studentSet.add(new Student("Mike", "Hauffmann",105, 20, 4.0));
        studentSet.add(new Student("John", "Lynn", 104, 22, 2.8));
        studentSet.add(new Student("Jim", "Max", 103, 20, 3.6));
        studentSet.add(new Student("Kelly", "Grant", 102, 19, 2.3));

        //Recorriendo TreeSet
        System.out.println("Imprimiendo TreeSet ");
        Iterator<Student> iter = studentSet.iterator();
        while (iter.hasNext()) {
            Student s = (Student) iter.next();
            System.out.printf("Nombre = %s %s  ID = %d Edad = %d  GPA= %f\n", s.getFirstName(), s.getLastName(), s.getStudentID(), s.getAge(), s.getGPA()); 
        }
        
        //Removiendo elemento
        Iterator<Student> iter2 = studentSet.iterator();
        while (iter2.hasNext()) {
            Student s = (Student) iter2.next();
            if (s.getLastName().equals("Max")) {
                iter2.remove();
            }
        }

        System.out.println("\n Imprimiendo TreeSet despues de eliminar ");
        Object[] studentArray = studentSet.toArray();
        Student s;
        for (Object obj : studentArray) {
            s = (Student) obj;
            System.out.printf("Nombre = %s %s  ID = %d Edad = %d  GPA= %f\n", s.getFirstName(), s.getLastName(), s.getStudentID(), s.getAge(), s.getGPA());
        }
        studentSet.clear();

        System.out.println("\n************************Compare To*****************************");
        //------------------- compareTo (Interfaz Comparable) ------------------
        //Los tipos de datos String, Date y Entero implementan la interfaz Comparable
        //Establece el orden natural
        //devuelve <0, entonces la cadena que llama al método es primero
        //devuelve == 0, entonces las dos cadenas son equivalentes
        //devuelve > 0, entonces el parámetro pasado al método Java compareTo() es primero.
        String str_Sample = "c";
        System.out.println("Compare To 'c'y b es : " + str_Sample.compareTo("b"));
        str_Sample = "a";
        System.out.println("Compare To 'a' y c es : " + str_Sample.compareTo("c"));
        str_Sample = "b";
        System.out.println("Compare To 'b' y z es : " + str_Sample.compareTo("z"));
        
        
        System.out.println("\n***********************Ordenado por GPA usando compare To ******************************");
        TreeSet studentSet1 = new TreeSet();
        studentSet1.add(new Student("Mike", "Hauffmann", 101, 20, 4.0));
        studentSet1.add(new Student("John", "Lynn", 104, 22, 2.8));
        studentSet1.add(new Student("Jim", "Max", 103, 20, 3.6));
        studentSet1.add(new Student("Kelly", "Grant", 102, 19, 2.3));
        
        Object[] studentArray1 = studentSet1.toArray();
        for (Object obj : studentArray1) {
            s = (Student) obj;
            System.out.printf("Nombre = %s %s   ID= %d Edad = %d  GPA= %f\n", s.getFirstName(), s.getLastName(), s.getStudentID(), s.getAge(), s.getGPA());
        }

        
        //En caso de que se requiera ordenar por otro atributo se debe de utilizar la interfaz Comparator
        //Por cada atributo que se requiera ordenear se debe de crear una clase e implementar la interfaz comparator
        System.out.println("\n ***********************Ordenado por nombre usando Comparator******************************");
        //Se crea un objeto de tipo comparator y se le asigna como parametro a la coleccion
        //De esta forma la coleccion será ordenada
        Comparator c = new NameComp();
        TreeSet studentSet2 = new TreeSet(c);
        studentSet2.add(new Student("Mike", "Hauffmann", 101, 20, 4.0));
        studentSet2.add(new Student("John", "Lynn", 104, 22, 2.8));
        studentSet2.add(new Student("Jim", "Max", 103, 20, 3.6));
        studentSet2.add(new Student("Kelly", "Grant", 102, 19, 2.3));

        Object[] studentArray2 = studentSet2.toArray();
        for (Object obj : studentArray2) {
            s = (Student) obj;
            System.out.printf("Nombre = %s %s   ID= %d Edad = %d  GPA= %f\n", s.getFirstName(), s.getLastName(), s.getStudentID(), s.getAge(), s.getGPA());
        }

        System.out.println("\n***********************Ordenado por edad usando Comparator******************************");
        Comparator c2 = new AgeComp();
        TreeSet studentSet3 = new TreeSet(c2);
        studentSet3.add(new Student("Mike", "Hauffmann", 101, 20, 4.0));
        studentSet3.add(new Student("John", "Lynn", 104, 23, 2.8));
        studentSet3.add(new Student("Jim", "Max", 103, 18, 3.6));
        studentSet3.add(new Student("Kelly", "Grant", 102, 19, 2.3));

        Object[] studentArray3 = studentSet3.toArray();
        for (Object obj : studentArray3) {
            s = (Student) obj;
            System.out.printf("Nombre = %s %s   ID= %d  Edad= %d  GPA= %f\n", s.getFirstName(), s.getLastName(), s.getStudentID(), s.getAge(), s.getGPA());
        }

    }
}
