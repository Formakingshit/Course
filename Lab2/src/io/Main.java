package io;

import java.util.Scanner;

public class Main {
    public static final String INPUT_MESSAGE = "Input number: ";
    public static final String MORE_THAN_NECESSARY = "More than you need\n";
    public static final String LESS_THAN_NECESSARY = "Less than you need\n";
    public static final String CORRECTLY = "Correctly!\n";

    public static boolean checker = true;

    public static void main(String[] args) {
        int numberNeed = (int)(Math.random() * 100) + 1;
        int numberYour;

        System.out.println("~~~Rule~~~");
        System.out.println("You must guess the number from 1 to 100\n");

        Scanner scanner = new Scanner(System.in);

        while(checker){
            outputMessage(INPUT_MESSAGE);
            numberYour = scanner.nextInt();

            if(numberYour > numberNeed){
                outputMessage(MORE_THAN_NECESSARY);
            }
            else if(numberYour < numberNeed){
                outputMessage(LESS_THAN_NECESSARY);
            }
            else{
                outputMessage(CORRECTLY);
                checker = false;
            }
        }
    }

    static void outputMessage(String message){
        System.out.println(message);
    }
}