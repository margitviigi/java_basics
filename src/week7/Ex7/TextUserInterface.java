package week7.Ex7;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");

        while (true) {
            System.out.print("\nStatement: ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    private void add() {
        System.out.print("In Finnish: ");
        String finnish = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        dictionary.add(finnish, translation);
    }

    private void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        String translation = dictionary.translate(word);
        if (translation == null) {
            System.out.println("Unknown word!");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
}
