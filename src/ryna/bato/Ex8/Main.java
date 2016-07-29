package ryna.bato.Ex8;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        double tsideA, tsideB, tsideC;
        double radius;

        Scanner scA = new Scanner(System.in);
        Scanner scB = new Scanner(System.in);
        Scanner scC = new Scanner(System.in);
        Scanner scR = new Scanner(System.in);

        System.out.print("Triangle Side A:\t");
        tsideA=scA.nextFloat();
        System.out.print("Triangle Side B:\t");
        tsideB=scB.nextFloat();
        System.out.print("Triangle Side C:\t");
        tsideC=scC.nextFloat();
        System.out.print("Circle Radius R:\t");
        radius=scR.nextFloat();

        System.out.println("\nCALCULATIONS");

        //Triangle tria = new Triangle(tsideA, tsideB, tsideC);
        //Circle circ = new Circle(radius);

        Triangle tria = new Triangle(5, 5, 5);
        Circle circ = new Circle(5);
        double tP = tria.calcPerimeter();
        double cP = circ.calcPerimeter();
        double cA = circ.calcArea();

        tria.displayShape();
        System.out.println("PERIMETER:\t" + tP);
        System.out.println("AREA:\t\t" + "would need to know base, height, and hypotenuse\n");

        circ.displayShape();
        System.out.println("PERIMETER:\t" + cP);
        System.out.println("AREA:\t\t" + cA);

    }
}

