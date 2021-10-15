package sef.FinalActivity;

import java.util.Comparator;

//A comparator for employees' salaries, used in FirstActivity
public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary()) * -1; //Compare, reverse result for descending order
    }
}
