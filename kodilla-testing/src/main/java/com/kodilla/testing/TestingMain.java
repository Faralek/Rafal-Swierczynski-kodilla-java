package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
        public static void main(String[] args) {
            SimpleUser simpleUser = new SimpleUser("theForumUser");

            String result = simpleUser.getUsername();

            if (result.equals("theForumUser")) {
                System.out.println("test OK");
            } else {
                System.out.println("Error!");
            }

            // test kalkulatora
            int a = 3;
            int b = 7;
            Calculator simpleCalculator = new Calculator();
            if (a + b == simpleCalculator.add(a, b)) {
                System.out.println("Dodawanie działa poprawnie");
            }
            if (a - b == simpleCalculator.substract(a,b)){
                System.out.println("odejmowanie działa poprawnie");
            }
        }
}
