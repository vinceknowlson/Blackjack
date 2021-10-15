package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int compNum1 = randNumGen();
        int compNum2 = randNumGen();
        int compTotal = (compNum1 + compNum2);

        int userNum1 = randNumGen();
        int userNum2 = randNumGen();
        int userTotal = (userNum1 + userNum2);

        if ((userTotal == 21) && (compTotal < 21)) {
            System.out.println("You win, well done");
        }
        if (userTotal < 21) {
            System.out.println("Your total is " + userTotal + "");
            System.out.println("Type 'YES' to draw another card, type 'NO to stand");
            String userDraw = input.next();
            if ((userDraw == "NO") && (userTotal < compTotal)) {
                System.out.println("You lose, unlucky bro");
            }
            if ((userDraw == "NO") && (userTotal = compTotal)) {
                System.out.println("Draw, play again");
            }
        }
    }

    public static int randNumGen() {
        Random random = new Random();
        return random.nextInt(11) + 1;
    }
}


