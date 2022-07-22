package Exercise3;

import java.util.*;

public class ListOfEmployee {
    private final List<Employee> employees;

    public ListOfEmployee(List<Employee> employees) {
        this.employees = employees;
    }

    List<Employee> getEmployeeForCompany(String company) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (company == null || employee.getCompany().equals(company)) {
                result.add(employee);
            }
        }
        return result;
    }

    Map<String, List<Employee>> MapOfEmployeeForCompany(String company) {
        Map<String, List<Employee>> result = new HashMap<>();
        for (Employee employee : employees) {
            if (company == null || employee.getCompany().equals(company)) {
                result.put("MAMA_MANU EMPLOYEES: ", getEmployeeForCompany(company));
            }

        }
        return result;
    }

    int sumOfSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    List<Employee> biggerSalaries(int amount) {
        List<Employee> result = new LinkedList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() > amount) {
                result.add(employee);
            }
        }
        return result;
    }

    String theBiggestSalary() {
        int max = Integer.MIN_VALUE;
        int companyIndex = 1;
        for (Employee employee : employees) {
            if (max < employee.getSalary()) {
                max = employee.getSalary();
                // company= employee.getCompany();
                //  company=String.format("%s",employee.getCompany());
                companyIndex = employees.indexOf(employee);
            }
        }
        return (employees.get(companyIndex)).getCompany();
    }
}
