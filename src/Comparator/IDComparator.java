package Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class IDComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.empId-o2.empId;
    }
}
