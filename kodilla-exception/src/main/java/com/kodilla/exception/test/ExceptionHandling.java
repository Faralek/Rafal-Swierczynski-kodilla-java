package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(20, 11);
        }catch (Exception e){
            System.out.println("Your arguments does not fit to value range");
        }
    }
}

