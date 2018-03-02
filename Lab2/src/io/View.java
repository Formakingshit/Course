package io;

import java.util.ArrayList;

public class View {
    public static final String MIN = "Input MIN: ";
    public static final String MAX = "Input MAX: ";
    public static final String INPUT_MESSAGE = "Input number: ";
    public static final String INCORRECTLY_INPUT_MESSAGE = "Please input correct data\n";
    public static final String MORE_THAN_NECESSARY = "More than you need\n";
    public static final String LESS_THAN_NECESSARY = "Less than you need\n";
    public static final String CORRECTLY = "Correctly!\n";
    public static final String GOOD_JOB = "Good job!\n";

    public static void outputMessage(String message){
        System.out.println(message);
    }

    public static void outputServiceInfo(int min, int max, ArrayList allNumberPrevious){
        System.out.println("Interval   ***[" + min + "," + max + "]***" );

        if(allNumberPrevious.size() != 0) {
            System.out.print("All previous values: ");

            for (Object allNumberPreviou : allNumberPrevious) {
                System.out.print(allNumberPreviou + "  ");
            }
            System.out.print("<-\n");
        } else {
            System.out.println("~~~Here will be information about all previous values~~~");
        }
    }

    public static void outputServiceInfo(int countAll){
        System.out.println("All you have tried " + countAll + " times");
    }

    public static void outputDefRules(){
        System.out.println("\t\t\t~~~Rules~~~");
        System.out.println("You must guess the number from 1 to 100\n");
    }

    public static void outputNewRules(){
        System.out.println("\t\t\t~~~New Rules~~~");
        System.out.println("You must guess the number from MIN to MAX\n");
    }
}
