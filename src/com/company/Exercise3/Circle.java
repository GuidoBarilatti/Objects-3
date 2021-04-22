package com.company.Exercise3;

public class Circle extends Figura {
    private double rad;

    public Circle(){
    }

    public Circle(char haveColor, String color, double rad) {
        super(haveColor,color);
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {

        this.rad = rad;
    }


    @Override
    public double calcPerimeter() {
        return 2*Math.PI*this.rad;
    }

    @Override
    double calcArea() {
        return Math.PI*Math.pow(rad,2);
    }

    @Override
    public String toString() {
        double perimeter = calcPerimeter();
        return "El circulo " + getColor() + " tiene un perimetro de " + perimeter + " cm" + " y un area de " + calcArea() +" cm^2";
    }
}
