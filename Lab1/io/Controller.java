package io;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    public void startProcess(){
        Scanner scanner = new Scanner(System.in);

        while(!scanner.nextLine().equals(model.getHello())){
            view.printMessage(View.WRONG_INPUT);
        }

        view.printMessage(View.TRUE_INPUT);
        view.printMessage(model.getHello());
    }
}