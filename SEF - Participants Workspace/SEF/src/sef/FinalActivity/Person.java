package sef.FinalActivity;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    //Default constructor
    public Person() {
    }

    //Parametrized constructor
    public Person(String firstName, String lastName, int age) throws NumInNameException {
        if (age > 0) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
        if ((firstName.matches(".*\\d.*")) || (lastName.matches(".*\\d.*"))) {
            throw new NumInNameException();
        }
        else {
            this.firstName = firstName;
            this.lastName = lastName;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NumInNameException {
        if (firstName.matches(".*\\d.*")) {
            throw new NumInNameException();
        }
        else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NumInNameException {
        if (lastName.matches(".*\\d.*")) {
            throw new NumInNameException();
        }
        else {
            this.lastName = lastName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }

    public void introduction() {
        System.out.println("My name is " + firstName + " " + lastName + " and I am " + age + " years old.");
    }

}
