package com.company.Exercise2;

public class Student extends Persona{
    private int ingress;
    private double monthlyFee;
    private String carrer;

    public Student(){

    }

    public Student( String dni, String name, String lastName, String mail, String direction,int ingress, double monthlyFee, String carrer)
    {
        super(dni,name,lastName,mail,direction);
        this.ingress = ingress;
        this.monthlyFee = monthlyFee;
        this.carrer = carrer;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public double CalcAnualFee(){
        return getMonthlyFee()*12;
    }
}
