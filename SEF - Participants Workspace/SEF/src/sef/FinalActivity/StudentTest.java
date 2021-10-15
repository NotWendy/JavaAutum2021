package sef.FinalActivity;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StudentTest extends TestCase {
    //Attributes
    private Student s;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    //Set up and tear down
    protected void setUp() throws Exception {
        super.setUp();
        s = new Student();
    }

    protected void tearDown() throws Exception {
        System.setOut(standardOut);
        super.tearDown();
    }

    //Test methods
    public void testSettersAndGetters() {

        //Setting new values, getting the results
        try {
            s.setFirstName("John");
            s.setLastName("Doe");
        } catch (Exception e) {
            fail();
        }

        s.setAge(20);
        s.setSchoolName("LU");
        assertEquals("John", (s.getFirstName()));
        assertEquals("Doe", (s.getLastName()));
        assertEquals(20, (s.getAge()));
        assertEquals("LU", (s.getSchoolName()));

    }

    public void testParamConstructor() {

        //Creating a new Student with a parametrized constructor
        try {
            s = new Student("John", "Doe", 20,"LU");
        } catch (Exception e) {
            fail();
        }

        assertEquals("John", (s.getFirstName()));
        assertEquals("Doe", (s.getLastName()));
        assertEquals(20, (s.getAge()));
        assertEquals("LU", (s.getSchoolName()));

    }

    public void testIntroduction() {

        System.setOut(new PrintStream(outputStreamCaptor));
        try {
            s = new Student("Jane", "Williams", 21, "LU");
        } catch (Exception e) {
            fail();
        }

        //Printing the introduction
        s.introduction();
        //I probably should've used BufferedReader
        Assert.assertEquals("My name is Jane Williams and I am 21 years old." +
                "\r\nI study in LU.", outputStreamCaptor.toString().trim());

    }

}
