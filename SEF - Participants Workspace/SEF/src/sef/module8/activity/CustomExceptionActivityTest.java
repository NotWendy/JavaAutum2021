package sef.module8.activity;
//Needs to be completed
//This program accepts a username and checks user's validity
//The username is checked against an array of names.

public class CustomExceptionActivityTest {

    //1 - Type main method and call validateUser() from it.
    //Call this method with different names to test it
    public static void main(String args[]) {
        try {
            validateUser("Invalid Name");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            validateUser("John");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    static void validateUser(String name) throws CustomExceptionActivity {
        //array of names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        //flag stores 1 if a match is found else it should remain 0
        boolean flag = false;

        /* 2 - Write code to check if parameter name contains a value which is found in validUsers array
               and change flag's value accordingly */
        for (int i = 0; i < 4; i++) {
            if (name == validUsers[i]) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Welcome to Payroll program, " + name + "!");
        }
        else {
            throw new CustomExceptionActivity();
        }
        //3 - check if flag is zero, throw CustomExceptionActivity Exception.
        //You may also have to declare this exception in the method call using throws.


        //4 - else if flag is one, print a message "Welcome to Payroll program".

    }
}
