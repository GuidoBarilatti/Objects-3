package com.company.Exercise1;

public class Cylinder extends Cirlcle {
    private double height=1;

    public Cylinder(){

    }

    public Cylinder(String color, double rad, double height) {
        super(color, rad);
        this.height = height;
    }

    public double calcVolume(){
        return super.calcArea()*height;
    }

    @Override
    public String toString(){
        String area= String.format("%.2f", calcArea());
        String volume= String.format("%.2f",calcVolume());
        return "El cilindro de color " + color + " tiene un radio de " + rad + " cm, un area de " + area + " cm^2," +
                " y un volumen de " + volume + " cm^3";
    }
    @Override
    public double calcArea(){
        return 2*Math.PI*height+2*super.calcArea();
    }
}
