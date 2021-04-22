package com.company;

import com.company.Exercise1.Cirlcle;
import com.company.Exercise1.Cylinder;
import com.company.Exercise2.Persona;
import com.company.Exercise2.Staff;
import com.company.Exercise2.Student;
import com.company.Exercise3.Circle;
import com.company.Exercise3.Rectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int op;
        int exit=1;
        while (exit==1){
            System.out.println("Elija un ejercicio a realizar");
            op= scanner.nextInt();
            switch (op){
                case 1:
                    exercise1();
                    break;
                case 2:
                    exercise2();
                    break;
                case 3:
                    exercise3();
                    break;
                case 0:
                    System.out.println("Adiosito");
                    exit=0;
                    break;
                default:
                    System.out.println("El ejercicio no existe o no lo realice gg");
                    break;
            }
        }
    }
    public static void exercise1(){
        Cirlcle circle= new Cirlcle();
        Cylinder cylinder= new Cylinder("blue",2,3);
       System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }

    public static void exercise2(){
        Student pepe=new Student("41149365","pepe","juarez","pepe@hotmail","av siempre viva,", 2020,3000,"programming");
        Student juan=new Student("20419354","juan","jose","jose@hotmail","colon 5000", 2019,4000,"cocina");
        Student popo=new Student("30483542","popo","pis","popo@hotmail","luro 2000,", 2018,5000,"choreo");
        Student pipi=new Student("80596521","pipi","caca","pipi@hotmail","libertad 1000", 2021,6000,"lava taper");
        Staff willie=new Staff("39741364","willie","jardinero","jardinero@live.com","primaria de springfield",0,"mañana");
        Staff edna=new Staff("2041751298","edna","clavados","edna@yahoo.com","depende el chongo",5000,"mañana");
        Staff armando=new Staff("521564423","armando","barreras","armando@gmail.com","la casa de la madre", 30000,"mañana");
        Staff siemurd=new Staff("54138435","siemurd","skinner","siemurd@hotmail.com","unknown",60000,"mañana");
        Persona [] personas= new Persona[8];
        personas[0]=pepe;
        personas[1]=juan;
        personas[2]=popo;
        personas[3]=pipi;
        personas[4]=willie;
        personas[5]=edna;
        personas[6]=armando;
        personas[7]=siemurd;
        int cantStudent=0;
        int cantStaff=0;
        for (Persona persona : personas) {
            if (persona instanceof Student) {
                cantStudent++;
            } else {
                cantStaff++;
            }
        }
        System.out.println("La cantidad de estudiantes es: " + cantStudent);
        System.out.println("La cantidad de personal de staff es: " + cantStaff);
        double total=0;
        for (Persona persona:personas){
            if(persona instanceof Student){
              total+=((Student) persona).CalcAnualFee();
            }
        }
        System.out.println("El colegio recibe $" +total+" anual por los estudiantes");
    }
    public static void exercise3(){
        Circle circle=new Circle('s',"azul",5);
        System.out.println(circle.toString());
    }
}
