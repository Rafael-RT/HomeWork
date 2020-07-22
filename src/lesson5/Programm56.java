package lesson5;

import java.util.Scanner;

public class Programm56 {
    public static void main(String[] args) {
        System.out.println("Enter any number.");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("The entered month is winter"); break;
            case 3:
            case 4:
            case 5:
                System.out.println("The entered month is spring"); break;
            case 6:
            case 7:
            case 8:
                System.out.println("The entered month is summer"); break;
            case 9:
            case 10:
            case 11:
                System.out.println("The entered month is autumn"); break;
            default:
                System.out.println("The entere month isn't exist");
        }
    }
}
