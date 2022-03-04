package day13;

import java.util.Scanner;

public class GettingInputFromUser1 {
    int age;
    Scanner scanner;

    public int initializeVariable() {
        scanner = new Scanner(System.in);
        do {
            System.out.println("please enter the age");
            String ageString = scanner.nextLine();
            return age;
        }
        while (age <= 0);
    }
            public static void main (String[]args)
            {
                GettingInputFromUser obj = new GettingInputFromUser();
                System.out.println("Your Age is:" + obj.initializeVariable());
            }
        }

