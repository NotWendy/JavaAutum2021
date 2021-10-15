package sef.FinalActivity;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EmployeeTest extends TestCase {
    //Attributes
    private Employee e;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    //Set up and tear down
    protected void setUp() throws Exception {
        super.setUp();
        e = new Employee();
    }

    protected void tearDown() throws Exception {
        System.setOut(standardOut);
        super.tearDown();
    }

    //Test methods
    public void testSettersAndGetters() {

        //Setting new values, getting the results
        try {
            e.setFirstName("John");
            e.setLastName("Doe");
        } catch (Exception e) {
            fail();
        }

        e.setAge(25);
        e.setCompany("Accenture");
        e.setJobTitle("Penetration Tester");
        e.setSalary(70000);
        assertEquals("John", (e.getFirstName()));
        assertEquals("Doe", (e.getLastName()));
        assertEquals(25, (e.getAge()));
        assertEquals("Accenture", (e.getCompany()));
        assertEquals("Penetration Tester", (e.getJobTitle()));
        assertEquals(70000.0, (e.getSalary()));

    }

    public void testParamConstructor() {

        //Creating a new Employee with a parametrized constructor
        try {
            e = new Employee("John", "Doe", 25,
                    "Accenture", "Penetration Tester", 70000);
        } catch (Exception e) {
            fail();
        }

        assertEquals("John", (e.getFirstName()));
        assertEquals("Doe", (e.getLastName()));
        assertEquals(25, (e.getAge()));
        assertEquals("Accenture", (e.getCompany()));
        assertEquals("Penetration Tester", (e.getJobTitle()));
        assertEquals(70000.0, (e.getSalary()));

    }

    public void testIntroduction() {

        System.setOut(new PrintStream(outputStreamCaptor));
        try {
            e = new Employee("Jane", "Williams", 41,
                    "Accenture", "System Analyst", 68000);
        } catch (Exception e) {
            fail();
        }

        //Printing the introduction
        e.introduction();
        //I probably should've used BufferedReader to handle line breaks
        //Line break is represented differently depending on the system. This solution is meant for Windows
        Assert.assertEquals("My name is Jane Williams and I am 41 years old." +
                "\r\nI work as a System Analyst at Accenture.", outputStreamCaptor.toString().trim());

    }

}
