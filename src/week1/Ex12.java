package week1;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = nameScanner.nextLine();
        Scanner ageScanner = new Scanner(System.in);
        System.out.print("Age: ");
        int age = ageScanner.nextInt();


        Scanner otherNameScanner = new Scanner(System.in);
        System.out.print("Name: ");
        String otherName = otherNameScanner.nextLine();
        Scanner otherAgeScanner = new Scanner(System.in);
        System.out.print("Age: ");
        int otherAge = otherAgeScanner.nextInt();

        int ageSum = age + otherAge;

        System.out.println(name + " and " + otherName + " are " + ageSum + " years old.");

    }
}
