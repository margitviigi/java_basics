package week2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type numbers: ");
        int number;
        int sum = 0;
        int count = 0;
        int countEven = 0;
        int countOdd = 0;
        while (true) {
            number = Integer.parseInt(reader.next());
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }

            count ++;
            sum = sum + number;
            if (number % 2 == 0) {
                countEven ++;
            }

            if (number % 2 == 1) {
                countOdd ++;
            }


        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("The average is " + sum / count);
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);
    }
}
