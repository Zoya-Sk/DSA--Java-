package Lecture2;

import java.util.*;

public class AoSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of Square: ");
        double side = sc.nextDouble();
        double area = side * side;

        System.out.print("Area of Square is " + area);

        sc.close();
    }

}
