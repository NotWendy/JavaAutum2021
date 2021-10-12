package sef.module6.activity;

public class Square extends Shape {

    double side;

    //Constructors
    public Square() {
        side = 0;
    }

    public Square(double side) {
        this.side = side;
    }

    //Methods
    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
       return side*4;
    }
}
