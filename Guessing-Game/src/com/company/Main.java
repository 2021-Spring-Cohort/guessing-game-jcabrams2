package com.company;

import java.util.Scanner;

public class Main {

    private static Object Scanner;

    public static void main(String[] args) {
//        1.When the user guesses 7, the game announces they have won. All other numbers lose.
    int number = 217;
    int numberGuess = 0;
        Scanner inputScanner= new Scanner(System.in);
        System.out.println("Guess a number!");

        numberGuess = inputScanner.nextInt();
        if (numberGuess == number){
            System.out.println("Correct, you win!");
        }else if ( numberGuess != number){
            System.out.println("Incorrect, you lose!");
        }




//    guessedNumber = (int);


//        System.out.println("Guess a number!");
//        guessedNumber = Scanner.nextInt
//        Scanner inputScanner = new Scanner(System.in);
//        int

    }
}
