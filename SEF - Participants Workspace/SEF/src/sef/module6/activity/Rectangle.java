package sef.module6.activity;

public class Rectangle extends Shape {

    double length;
    double width;

    //Constructors
    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Methods
    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return (length + width)*2;
    }
}
