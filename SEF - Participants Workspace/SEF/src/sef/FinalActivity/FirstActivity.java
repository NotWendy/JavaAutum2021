package sef.FinalActivity;

import java.io.FileWriter;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class FirstActivity {
    public static void main(String args[]) throws NumInNameException {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("John", "Doe", 25,
                "Accenture", "Penetration Tester", 70000));

        employees.add(new Employee("Jane", "Williams", 41,
                "Accenture", "System Analyst", 68000));

        employees.add(new Employee("Daniel", "Johnson", 30,
                "Accenture", "System Analyst", 67000));

        //Sorting the arraylist by salary using a custom comparator
        EmployeeSalaryComparator com = new EmployeeSalaryComparator();
        employees.sort(com);

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getFirstName() + " " + employees.get(i).getLastName() +
                    " " + employees.get(i).getSalary());
        }

        //This part is for bonus 4
        System.out.println();
        System.out.println("Sorting by name and surname:");
        employees.add(new Employee("Jane", "Siegmann", 28,
                "Accenture", "System Analyst", 69000));
        EmployeeNameComparator nameCom = new EmployeeNameComparator();
        employees.sort(nameCom);
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getFirstName() + " " + employees.get(i).getLastName());
        }
        System.out.println();

        //This part is for bonus 2
        //Make a file
        //It is created in the SEF folder
        try {
            File employeeFile = new File("EmployeeList.txt");
            if (employeeFile.createNewFile()) {
                //Write into the file
                try {
                    FileWriter myWriter = new FileWriter("EmployeeList.txt");
                    for (int i = 0; i < employees.size(); i++) {
                        myWriter.write(employees.get(i).getFirstName() + " " + employees.get(i).getLastName() + "\n");
                    }
                    myWriter.close();
                    System.out.println("EmployeeList file is ready.");
                } catch (IOException e) {
                    System.out.println("An error occurred writing into the file.");
                    e.printStackTrace();
                }

            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred creating or opening a file.");
            e.printStackTrace();
        }

    }

}
