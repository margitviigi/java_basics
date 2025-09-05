package week1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        double radius = reader.nextInt();
        double circumference = 2.00 * Math.PI * radius;


        System.out.println("Circumference of the circle: " + circumference);
    }
}
