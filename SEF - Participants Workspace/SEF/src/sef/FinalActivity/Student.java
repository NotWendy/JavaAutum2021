package sef.FinalActivity;

public class Student extends Person {
    private String schoolName;

    public Student() {}

    public Student(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String firstName, String lastName, int age, String schoolName) throws NumInNameException {
        super(firstName, lastName, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void introduction() {
        super.introduction();
        System.out.println("I study in " + schoolName + ".");
    }
}
