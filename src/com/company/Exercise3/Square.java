package com.company.Exercise3;

public class Square extends Figura{
    private double width;

    public Square(double width) {
    }

    public Square(char haveColor, String color, double width) {
        super(haveColor, color);
        this.width = width;
    }

    @Override
    double calcArea() {
        return Math.pow(width,2);
    }

    @Override
    double calcPerimeter() {
        return width*4;
    }
}
