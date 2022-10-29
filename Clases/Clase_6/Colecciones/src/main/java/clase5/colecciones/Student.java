package clase5.colecciones;

public class Student implements Comparable<Student>{

    protected String firstName, LastName;
    protected int StudentID;
    protected double GPA;
    protected Integer Age;

    public Student(String firstName, String LastName, int StudentID, int age, double GPA) {
        if (firstName == null || LastName == null || StudentID == 0 || age==0 || GPA == 0) {
            //La sentencia throw se utiliza para lanzar explícitamente una excepción. En primer lugar se debe obtener un descriptor de un objeto Throwable, 
            //bien mediante un parámetro en una cláusula catch o, se puede crear utilizando el operador new.
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.LastName = LastName;
        this.StudentID = StudentID;
        this.Age= age;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getStudentID() {
        return StudentID;
    }

    public double getGPA() {
        return GPA;
    }
    public Integer getAge() {
        return Age;
    }

    //Implementar metodo compareTo
    //Si sabemos por cual atributo vamos a ordenar utilizamos compareTo
    //devuelve <0, entonces la cadena que llama al método es primero
    //devuelve == 0, entonces las dos cadenas son equivalentes
    //devuelve > 0, entonces el parámetro pasado al método Java compareTo() es primero.

        @Override
    public int compareTo(Student s)
    {
        if(this.GPA==s.GPA)
            return 0;
        else if (this.GPA<s.GPA)
            return -1;
        else
            return 1;
    }
    //orden natural significa que tu colección de objetos 
    //tendrá únicamente un método de comparación o un criterio.

}
