package com.company;

import java.util.Scanner;

public class Slova{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");

        String word = scanner.next();
        int size = word.length();

        if (size % 2 == 1){
            int counter = 0;

            for (int i = size / 2; counter < 3; i++){
                System.out.print(word.charAt(i));
                counter++;
            }
        } else {
            for (int i = 0; i < word.length() - 2; i++){
                System.out.print(word.charAt(i));
            }
        }
    }

}
