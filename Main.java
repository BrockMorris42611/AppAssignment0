/*
Brock Morris, tuj42611
assignment0
1/27/21
 */

import java.util.Scanner;
import java.lang.System;
public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); //i wasnt able to test this because i was getting errors for my print statements and loops.
        // im not sure what was wrong but all it did was highlight "println" and say "unresolved symbol".

        Square shape1 = new Square("square");
        System.out.println("enter in the length of the square>");
        double shape1_len = kb.nextDouble();
        System.out.println("\nenter in the height of the square>");
        double shape1_height = kb.nextDouble();
        shape1.setDimensions(shape1_len, shape1_height);

        System.out.println(shape1.getName());
        shape1.printDimensions();
        System.out.println("area: " + shape1.getArea());


        Circle shape2 = new Circle("Circle");
        System.out.println("enter in the radius of the circle>");
        double shape2_radius = kb.nextDouble();
        shape2.setDimensions(shape2_radius);


        System.out.println(shape2.getName());
        shape2.printDimensions();
        System.out.println("area: " + shape2.getArea());


        Triangle shape3 = new Triangle("Triangle");
        System.out.println("enter in the side of the triangle>");
        double shape3_side1 = kb.nextDouble();
        System.out.println("enter in the next side of the triangle>");
        double shape3_side2 = kb.nextDouble();
        System.out.println("enter in the next side of the triangle>");
        double shape3_side3 = kb.nextDouble();
        shape3.setDimensions(shape3_side1, shape3_side2, shape3_side3);

        System.out.println(shape3.getName());
        shape3.printDimensions();
        System.out.println("area: " + shape3.getArea());


        EquilateralTriangle shape4 = new EquilateralTriangle("EquilateralTriangle");
        System.out.println("enter in the side of the equilateral triangle>");
        double shape4_side = kb.nextDouble();
        shape4.setDimensions(shape4_side);

        System.out.println(shape4.getName());
        shape4.printDimensions();
        System.out.println("area: " + shape4.getArea());

    }
}
