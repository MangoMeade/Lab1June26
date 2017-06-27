package com.jetBrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Grand Circus' Room Detail Generator!");

        Scanner scnr = new Scanner(System.in);
        double length = 0; //variables for different parameters
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double volume = 0;
        String Loop = "y";

        while (Loop.equals("y") ) { //while loop variable equals y keep repeating
            System.out.print("Enter Length: ");
            length = scnr.nextDouble();
            System.out.print("Enter Width: ");
            width = scnr.nextDouble();
            System.out.print("Enter Height: ");
            height = scnr.nextDouble();

            area = length * width;
            perimeter = (length * 2) + (width * 2);
            volume = length * width * height;
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Volume: " + volume);

            System.out.print("Continue? (y/n): ");
            Loop = scnr.next();

            if (Loop.equals("y")) {
                continue;
            }
            else if (Loop.equals("n")) {
                break;
            }
            while (!Loop.equals("y") && !Loop.equals("n")) { //if loop does not equal y or n run this while loop
                System.out.println("Type y or n!");
                Loop = scnr.next();
            }
        }
    }
}