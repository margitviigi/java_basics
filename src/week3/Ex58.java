package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Type a word: ");
            String word = scanner.next();

            if (words.contains(word)) {
                System.out.println("You gave the word " + word + " twice.");
                break;
            }

            words.add(word);
        }

        scanner.close();
    }
}