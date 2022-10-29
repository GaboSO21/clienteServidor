package clase5.colecciones;

import java.util.Comparator;

public class AgeComp implements Comparator<Student> {

    @Override
    public int compare(Student student, Student student2) {
        return student.getAge().compareTo(student2.getAge());
    }

}
