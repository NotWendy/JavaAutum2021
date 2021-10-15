package sef.FinalActivity;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonTest extends TestCase {
    //Attributes
    private Person p;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    //Set up and tear down
    protected void setUp() throws Exception {
        super.setUp();
        p = new Person();
    }

    protected void tearDown() throws Exception {
        System.setOut(standardOut);
        super.tearDown();
    }

    //Test methods
    public void testSettersAndGetters() {

        //Setting new values, getting the results
        try {
            p.setFirstName("John");
            p.setLastName("Doe");
        }
        catch (Exception e) {
            fail();
        }

        p.setAge(25);
        assertEquals("John", (p.getFirstName()));
        assertEquals("Doe", (p.getLastName()));
        assertEquals(25, (p.getAge()));

    }

    public void testParamConstructor() {

        //Creating a new Person with a parametrized constructor
        try {
            p = new Person("Daniel", "Johnson", 30);
        }
        catch (Exception e) {
            fail();
        }

        assertEquals("Daniel", (p.getFirstName()));
        assertEquals("Johnson", (p.getLastName()));
        assertEquals(30, (p.getAge()));

    }

    public void testIntroduction() {

        System.setOut(new PrintStream(outputStreamCaptor));
        try {
            p = new Person("John", "Doe", 25);
        }
        catch (Exception e) {
            fail();
        }
        //Printing the introduction
        p.introduction();
        Assert.assertEquals("My name is John Doe and I am 25 years old.", outputStreamCaptor.toString().trim());

    }

    //We can count this as a solution for task 9
    public void testNumInName() {
        //Throwing an exception for digit in the name
        try {
            p = new Person("Jo1hn", "Doe", 25);
        } catch (Exception e) {
            System.out.println("Exception caught!");
            assertEquals("Name cannot contain digits!", e.getMessage());
        }
    }

}
