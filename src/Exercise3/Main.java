package Exercise3;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Employee> employees = new LinkedList<>();
        ListOfEmployee listOfEmployee = new ListOfEmployee(List.of(
                new Employee("Popescu Sorin", 32, "blond", 4100, "google"),
                new Employee("Preta Stefan", 22, "brunet", 1800, "MamaManu"),
                new Employee("Ionescu Diana", 25, "roscat", 6500, "E-mag"),
                new Employee("Sefanescu Raul", 21, "saten", 5400, "Cel"),
                new Employee("Dinescu Andrei", 34, "blond", 2400, "MamaManu"),
                new Employee("Popa Matei", 28, "brunet", 4700, "ABC"),
                new Employee("Lazarescu Ion", 35, "blond", 8000, "Tazz"),
                new Employee("Borza Alina", 44, "saten", 15000, "MamaManu")
        ));
        System.out.println(listOfEmployee.biggerSalaries(5000));
        System.out.println(listOfEmployee.getEmployeeForCompany("MamaManu"));
        System.out.println(listOfEmployee.MapOfEmployeeForCompany("MamaManu"));
        System.out.println(listOfEmployee.sumOfSalary());
        System.out.println(listOfEmployee.theBiggestSalary());


    }
}
