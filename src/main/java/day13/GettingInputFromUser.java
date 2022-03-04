package day13;

import java.util.Scanner;

public class GettingInputFromUser
{
    //Initializing the scanner object
    int age;
    Scanner scanner;

    public int initializeVariable()
    {
        scanner = new Scanner(System.in);

        System.out.println("please enter the age");

        //Getting the input value from user

        String ageString = scanner.nextLine();
        age = Integer.parseInt(ageString);
        return age;
    }

    public static void main(String[] args)
    {
        GettingInputFromUser obj = new GettingInputFromUser();
        System.out.println("Your Age is:" + obj.initializeVariable());
    }
}

    //GettingInputFromUser(int age)
    //{
        //this.age=age;
        //System.out.println(this.age);
    //}

