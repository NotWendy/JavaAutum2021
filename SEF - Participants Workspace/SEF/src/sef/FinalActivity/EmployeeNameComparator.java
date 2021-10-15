package sef.FinalActivity;

import java.util.Comparator;

//A comparator for employees' names and surnames, used in FirstActivity for bonus 4
public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int res = CharSequence.compare(e1.getFirstName(), e2.getFirstName());

        if (res == 0) {
            return CharSequence.compare(e1.getLastName(), e2.getLastName());
        } else {
            return res;
        }

    }

}
