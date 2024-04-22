package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
    int id;
    String firstName;
    String lastName;
    int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.salary-o.getSalary();
    }
}

class CustomComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.firstName.equals(o2.firstName)) {
            return o1.lastName.compareTo(o2.lastName);
        }
        return o1.firstName.compareTo(o2.firstName);
    }
}


public class Sorting {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Adil", "Pathan", 25000);
        Employee e2 = new Employee(2, "Sana", "Qadri", 15000);
        Employee e3 = new Employee(3, "Adil", "Khan", 35000);
        Employee e4 = new Employee(4, "Vidya", "Iyer", 19000);
        Employee e5 = new Employee(5, "Abhishek", "Lodha", 45000);

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        Collections.sort(list, new CustomComparator());
        Collections.sort(list);
        list.forEach((e) -> System.out.println(e.firstName+" "+e.lastName+" "+e.getSalary()));
    }
}
