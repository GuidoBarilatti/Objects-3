package com.company.Exercise3;

public abstract class Figura {
    char haveColor;
    String color;

    public Figura(){
    }

    public char getHaveColor() {
        return haveColor;
    }

    public void setHaveColor(char haveColor) {
        this.haveColor = haveColor;
    }

    public String getColor() {
        if(haveColor=='n'){
            color="que no tiene color";
        }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Figura(char haveColor, String color) {
        this.haveColor = haveColor;
        this.color = color;
    }

    abstract double calcArea();
    abstract double calcPerimeter();
}
