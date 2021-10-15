package sef.FinalActivity;

//Custom exception for task 8
public class NumInNameException extends Exception {
    @Override
    public String getMessage() {
        return "Name cannot contain digits!";
    }

}