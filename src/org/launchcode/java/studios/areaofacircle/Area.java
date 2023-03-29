package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Double pi = 3.14;

        System.out.println("Enter a radius: ");

        Double radius = input.nextDouble();

        if (radius.equals("")){
            System.out.println("Please enter a numeric value: ");
            radius = input.nextDouble();
        } else if (radius <= 0){
            System.out.println("Please enter a positive number: ");
            radius = input.nextDouble();
        }

        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " +  area);
    }
}
