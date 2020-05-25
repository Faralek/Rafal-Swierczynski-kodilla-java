package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        RpsInterface rpsInterface = new RpsInterface();
        rpsInterface.startGame();
        rpsInterface.showInterface();
        //##########################
        boolean x = false;
        while (!x) {
            int playerScore = 0;
            int computerScore = 0;
            while (rpsInterface.getWinningCondition() != playerScore && rpsInterface.getWinningCondition() != computerScore) {

                int t = rpsInterface.round();
                if (t == 1) {
                    System.out.println("Czy na pewno chcesz wyjsc z gry? y - tak, n - nie");
                    Scanner scanner = new Scanner(System.in);
                    String wantToExit = scanner.next();

                    if (wantToExit.equals("y")) {
                        System.exit(0);
                    }
                    if (wantToExit.equals("n")) {
                        continue;
                    }
                }
                if (t == 2) {
                    System.out.println("Nacisnij y jesli chcesz przerwac, n jesli chcesz kontynuowac");
                    Scanner scanner = new Scanner(System.in);
                    String wantToContinue = scanner.next();
                    if (wantToContinue.equals("n")) {
                        continue;
                    }
                    if (wantToContinue.equals("y")) {
                        break;
                    }
                }

                int z = rpsInterface.winCheck();

                if (z == 1) {
                    playerScore++;
                    System.out.println("playerScore " + playerScore);
                }
                if (z == 2) {
                    computerScore++;
                    System.out.println("computerScore " + computerScore);
                }
            }
            //####################
            System.out.println("Chcesz zagrać jeszcze raz?");
            System.out.println("naciśnij y jeśli tak");
            x = rpsInterface.wannaPlay();
        }
    }
}


