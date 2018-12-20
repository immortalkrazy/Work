import java.util.Comparator;

public class SortByFirstName implements Comparator<Student>{

  public int compare(Student lhs, Student rhs){
    return lhs.getFirstName().compareTo(rhs.getFirstName());
  }
}
