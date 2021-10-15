package sef.FinalActivity;

public class Employee extends Person {
    private String company;
    private String jobTitle;
    private double salary;

    public Employee() {}

    public Employee(String company, String jobTitle) {
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public Employee(String firstName, String lastName, int age,
                    String company, String jobTitle, double salary) throws NumInNameException {
        super(firstName, lastName, age);
        this.company = company;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
        else {
            this.salary = 0;
        }
    }

    @Override
    public void introduction() {
        super.introduction();
        System.out.println("I work as a " + jobTitle + " at " + company + ".");
    }
}
