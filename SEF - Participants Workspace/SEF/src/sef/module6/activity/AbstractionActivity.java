package sef.module6.activity;

public class AbstractionActivity {
    public static void main(String args[]) {

        Square s = new Square(10);
        s.setColor("RED");
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());

        Rectangle r = new Rectangle(10, 5);
        r.setColor("GREEN");
    }
}
