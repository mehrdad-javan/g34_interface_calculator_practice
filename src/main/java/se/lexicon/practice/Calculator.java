package se.lexicon.practice;

import java.util.Scanner;

public interface Calculator {

    Scanner SC = new Scanner(System.in);

    int addition(int number1, int number2);

    int subtraction(int number1, int number2);

    int multiplication(int number1, int number2);

    int division(int number1, int number2);

    static String takeInput() {
        return SC.nextLine();
    }

    default void menu() {
        System.out.println("########## welcome to my calculator ##########");
    }

}
