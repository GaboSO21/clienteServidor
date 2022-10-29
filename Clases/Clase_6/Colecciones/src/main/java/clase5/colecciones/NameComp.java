
package clase5.colecciones;
import java.util.*;

public class NameComp implements Comparator<Student>{
    
    @Override
    public int compare(Student student, Student student2) {
        return student.getFirstName().compareTo(student2.getFirstName());
    }
    
}
