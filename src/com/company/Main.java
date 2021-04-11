package com.company;

import com.company.Exercise1.Cirlcle;
import com.company.Exercise1.Cylinder;
import sun.security.mscapi.CPublicKey;

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
                case 0:
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
}
