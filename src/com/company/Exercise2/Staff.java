package com.company.Exercise2;

public class Staff extends Persona{
    private double salary;
    private String shift;

    public Staff(){

    }
    public Staff(String dni, String name, String lastName, String mail, String direction, double salary, String shift){
        super(dni,name,lastName,mail,direction);
        this.salary=salary;
        this.shift=shift;
    }
}
