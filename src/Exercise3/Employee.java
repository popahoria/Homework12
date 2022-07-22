package Exercise3;

import Exercise2.Person;

import java.util.List;

public class Employee extends Person {
    private int salary;
    private String company;

    public Employee(String name, int age, String hairColour, int salary, String company) {
        super(name, age, hairColour);
        this.salary = salary;
        this.company = company;
    }

    public Employee(List<Employee> employees) {
        super();
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Employee{" + super.getName() + ", " +
                "salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }
}
