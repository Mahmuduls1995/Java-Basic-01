package Mahmud;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String names = input.nextLine();
        // String name = System.console().readLine();
        System.out.println("Hello " + names);

        System.out.println("Enter Your Age:  ");
        // int age = input.nextInt();
        double age = input.nextDouble();
        System.out.println("Your Age is: " + age);

    }
}
