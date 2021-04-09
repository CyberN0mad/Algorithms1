package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Summa {

    private static int n;

    private void add() {
        userInput();
        addNumbers();}



    public static void userInput(){
        Scanner scan = new Scanner(System.in);
        System.out.format("Enter number");
        n = scan.nextInt();
    }

    private void addNumbers(){
        String one = "1";
        long result = 0;
        List<String> numbers = new ArrayList<>();
        if (n<10){
            for (int i = 1; i < n; i++) {
                numbers.add(one.repeat(i));

            }

            System.out.println("Result");

            for (String num: numbers){
                result += Long.parseLong(num);
                if (numbers.indexOf(num) == numbers.size() - 1)
                    System.out.println(num);
                else;
                System.out.printf("%s + ", num);
            }

            System.out.printf("\nSum: %d%n", result);
        } else {
            System.out.println("Please enter number <10");
            add();
        }

    }



}
