package Mahmud;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
//        System.out.println("Enter 1st numbers: ");
//        int a = input.nextInt();
//        System.out.println("Enter 2nd numbers: ");
//        int b = input.nextInt();
//        if (a >b) {
//            System.out.println(a + " is Grater than " + b);
//        } else if (a == b) {
//            System.out.println(a + " is Equal to " + b);
//        }
//        else System.out.println(a + " is less than " + b);


//        System.out.println("Pleas enter a text: ");
//        String text = input.nextLine();
//
//        if (text.equalsIgnoreCase("Mahmud")){
//            System.out.println("Your Text is Mahmud");
//        }

        System.out.println("Pleas enter a text: ");
        String text = input.nextLine();

        switch (text){
            case "Mahmud":
                System.out.println("Mahmud");
                break;
            case "Meh raj":
                System.out.println("Meh raj");
                break;
            default:
                System.out.println("Your Text is Unknown");
        }

    }
}
