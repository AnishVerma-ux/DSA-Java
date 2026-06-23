//package Comparator;
//
//public class Employee implements  Comparable<Employee> {
//    int empId;
//    String name;
//    int salary;
//
//    public Employee(int empId, String name, int salary) {
//        this.empId = empId;
//        this.name = name;
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empId=" + empId +
//                ", name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
//
//
//    @Override
//    public int compareTo(Employee that) {
//
//        return this.salary-that.salary;
//    }
//}
package Comparator;

import java.util.Comparator;

public class Employee  {
    int empId;
    String name;
    int salary;

    public Employee(int empId, String name, int salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }




}

