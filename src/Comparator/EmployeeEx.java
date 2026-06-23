package Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmployeeEx {
    public static void main(String [] args){
//        ArrayList<String> emp =new ArrayList<>();
//        emp.add("amit");
//        emp.add("sumit");
//        emp.add("rohit");
//        emp.add("rakesh");
//        System.out.print("Before sorting"+ emp);
//        System.out.println();
//Collections.sort(emp);
//System.out.print("after sorting"+emp);

        ArrayList<Employee> emp=new ArrayList<>();
        emp.add(new Employee(101,"AMIT",40000));

        emp.add(new Employee(102,"ANISH",40000));

        emp.add(new Employee(103,"AMAN",30000));

        emp.add(new Employee(104,"AYUSH",20000));

       System.out.print("before sorting"+emp);
       System.out.println();
      Collections.sort(emp,new IDComparator());
        System.out.print("after sorting"+emp);
       System.out.println();
      Collections.sort(emp,new SalaryComparator());
       System.out.println();
       System.out.print("after sorting"+emp);
Collections.sort(emp,new NameComparator());
       System.out.println();
       System.out.print(emp);



    }
}
