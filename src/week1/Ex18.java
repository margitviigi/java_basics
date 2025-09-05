package week1;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int number = reader.nextInt();

        if (number <= 29) {
            System.out.println("Failed");
        } else if (number <= 34) {
            System.out.println("1");
        } else if (number <= 39) {
            System.out.println("2");
        } else if (number <= 44) {
            System.out.println("3");
        } else if (number <= 49) {
            System.out.println("4");
        } else if (number <= 60) {
            System.out.println("5");
        } else {
            System.out.println("Input invalid");
        }
    }
}
