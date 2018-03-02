package io;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Controller {

    public void execute(){
        int numberNeed = rand();
        int min,
            max;

        View.outputDefRules();
        guessTheNumber(numberNeed, Model.RAND_MIN, Model.getRandMax());
        View.outputNewRules();

        do {
            min = takeBorder(View.MIN);
            max = takeBorder(View.MAX);
        }while(checkBorder(min, max));
        numberNeed = rand(min, max);

        guessTheNumber(numberNeed, min, max);
    }
        
    private void guessTheNumber(int numberNeed, int min, int max){
        int countAll = 0;
        int numberYourInt;
        String numberYour;
        Scanner scanner = new Scanner(System.in);
    
        ArrayList allNumberPrevious = new ArrayList();

        while(Model.checker){
            View.outputServiceInfo(min, max, allNumberPrevious);
            View.outputMessage(View.INPUT_MESSAGE);
            numberYour = scanner.nextLine();
    
            if(test(numberYour)) {
                numberYourInt = Integer.parseInt(numberYour);
    
                if (numberYourInt > numberNeed) {
                    View.outputMessage(View.MORE_THAN_NECESSARY);
                } else if (numberYourInt < numberNeed) {
                    View.outputMessage(View.LESS_THAN_NECESSARY);
                } else {
                    View.outputMessage(View.CORRECTLY);
                    Model.checker = false;
                }
                allNumberPrevious.add(numberYourInt);
    
            } else{
                View.outputMessage(View.INCORRECTLY_INPUT_MESSAGE);
            }
            countAll++;
        }
        Model.checker = true;
        View.outputServiceInfo(countAll);
    }
    
    private int takeBorder(String border){
        int numberYourInt = 0;
        String numberYour;
        Scanner scanner = new Scanner(System.in);
    
        while (Model.checker){
            View.outputMessage(border);
            numberYour = scanner.nextLine();
    
            if (test(numberYour)){
                View.outputMessage(View.GOOD_JOB);
                Model.checker = false;
                numberYourInt = Integer.parseInt(numberYour);
            } else {
                View.outputMessage(View.INCORRECTLY_INPUT_MESSAGE);
            }
        }
        Model.checker = true;
        return numberYourInt;
    }
    
    private boolean test(String testString){
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(testString);
        return m.matches();
    }
    
    private int rand(){
        return (int)(Math.random() * Model.getRandMax()) + 1;
    }
    
    private int rand(int min, int max){
        return min + (int)(Math.random() * (max - min + 1)) ;
    }
    
    private boolean checkBorder(int min, int max){
        if(min < max){
            return false;
        } else {
            View.outputMessage(View.INCORRECTLY_INPUT_MESSAGE);
            return true;
        }
    }
}