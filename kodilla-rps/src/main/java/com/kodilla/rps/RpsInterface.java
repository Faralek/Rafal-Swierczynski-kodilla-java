package com.kodilla.rps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RpsInterface {
    int winningCondition;

    ArrayList<Shape> shapes = new ArrayList<>();
    ArrayList<Shape> winningShapes = new ArrayList<>();
    ArrayList<Shape> losingShapes = new ArrayList<>();

    Shape currentShape;

    Shape rock = new Shape("Rock");
    Shape scrissors = new Shape("Scrissors");
    Shape paper = new Shape("Paper");
    Shape lizard = new Shape("lizard");
    Shape spock = new Shape("Spock");


    public int getWinningCondition() {
        return winningCondition;
    }

    public boolean wannaPlay() {
        Scanner sc = new Scanner(System.in);
        String wantToPlay = sc.next();
        return !wantToPlay.equals("y");
    }

    public void startGame() {
        System.out.println("Podaj imię");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
           System.out.println("Grasz jako : "+userName);
        System.out.println("Do ilu wygranych chciałbyś zagrać?");
        winningCondition = sc.nextInt();
        //   System.out.println(winningCondition);
    }

    public void showInterface() {
        System.out.println("klawisz 1 - zagranie kamień");
        System.out.println("klawisz 2 - zagranie papier");
        System.out.println("klawisz 3 - zagranie nożyce");
        System.out.println("klawisz 4 - zagranie jaszczurka");
        System.out.println("klawisz 5 - zagranie spock");
        System.out.println("klawisz x - zakończenie gry");
        System.out.println("klawisz n - uruchom nową grę");
    }

    public int round() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wykonaj swój ruch");
        String move = sc.next();

        shapes.clear();
        winningShapes.clear();
        losingShapes.clear();

        shapes.add(rock);
        shapes.add(scrissors);
        shapes.add(paper);
        shapes.add(lizard);
        shapes.add(spock);

        if (move.equals("1")) {
            System.out.println("Twój ruch - 'Rock'");
            currentShape = rock;
            shapes.add(paper);
            shapes.add(spock);
            winningShapes.add(spock);
            winningShapes.add(paper);
            losingShapes.add(lizard);
            losingShapes.add(scrissors);
        }
        if (move.equals("2")) {
            System.out.println("Twój ruch - 'Paper'");
            currentShape = paper;
            shapes.add(scrissors);
            shapes.add(lizard);
            winningShapes.add(scrissors);
            winningShapes.add(lizard);
            losingShapes.add(spock);
            losingShapes.add(rock);
        }
        if (move.equals("3")) {
            System.out.println("Twój ruch - 'Scrissors'");
            currentShape = scrissors;
            shapes.add(rock);
            shapes.add(spock);
            winningShapes.add(rock);
            winningShapes.add(spock);
            losingShapes.add(paper);
            losingShapes.add(lizard);
        }
        if (move.equals("4")) {
            System.out.println("Twój ruch - 'Lizard'");
            currentShape = lizard;
            shapes.add(rock);
            shapes.add(scrissors);
            winningShapes.add(rock);
            winningShapes.add(scrissors);
            losingShapes.add(spock);
            losingShapes.add(paper);
        }
        if (move.equals("5")) {
            System.out.println("Twój ruch - 'Spock'");
            currentShape = spock;
            shapes.add(paper);
            shapes.add(lizard);
            winningShapes.add(paper);
            winningShapes.add(lizard);
            losingShapes.add(rock);
            losingShapes.add(scrissors);
        }
        if (move.equals("x")) {
            return 1;
        }
        if (move.equals("n")) {
            System.out.println("Czy na pewno chcesz rozpocząć nową gre? Utracisz wszelkie postępy");
            return 2;
        }
        return 0;
    }

    public int winCheck() {

        Collections.shuffle(shapes);
        System.out.println("Ruch przeciwnika - " + shapes.get(0).toString());
        if(winningShapes.contains(shapes.get(0))){
            return 2;
        }
        if(losingShapes.contains(shapes.get(0))){
            return 1;
        }
        return 0;
    }
}
