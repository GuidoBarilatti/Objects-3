package com.company.Exercise3;


public class Rectangle extends Square{
    private double height;

    public Rectangle(double width,char haveColor, String color, double height) {
        super(width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
