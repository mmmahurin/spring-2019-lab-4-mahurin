package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //The driver code for the menu goes in main
        //Create keyboard object
        Scanner keyboard = new Scanner(System.in);
        String userChoice = "0";

        while (!userChoice.equals("3")) {
            userChoice = menuChoice(keyboard);

            switch (userChoice) {
                case "1":
                    displayTriangle();
                    break;
                case "2":
                    displayChart();
                    break;
                default:
                    if (!userChoice.equals("3")) System.out.println("Enter a valid choice");
            }
        }
    }


    public static String menuChoice(Scanner keyboard) {
        String choice = "0";
        System.out.println("Enter 1 for triangle");
        System.out.println("Enter 2 for chart");
        System.out.println("Enter 3 to exit");
        choice = keyboard.nextLine();
        return choice;
    }


    /**
     * This method is used to disply the triangle when called from the main menu
     */
    public static void displayTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /**
     * This method is used to display the table of numbers when called from the main menu
     * Use the tab escape sequence to get output to line up i.e. ("\t")
     */
    public static void displayChart() {
        int p = 0;
        for (int num = 1; num<= 4; num+=1){
         System.out.println(num);
        for (int m = 0; m <= 9; m+=1){
            p = num * m;
            System.out.print("\t");
            System.out.print(p);

        }
        System.out.println();
        }


    }
}


