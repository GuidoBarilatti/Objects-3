package com.company.Exercise1;

public class Cirlcle {
    protected double rad=1;
    protected String color="red";

    public Cirlcle(){
    }
    public Cirlcle(String color,double rad){
        this.color=color;
        this.rad=rad;
    }

    public double calcArea(){
        return Math.PI*rad*rad;
    }



    @Override
    public String toString(){
        String string=String.format("%.2f",calcArea());
        return "El circulo de color "+ color +" tiene un radio de "+ rad + " cm, y un area de " + string+" cm^2";
    }
}
