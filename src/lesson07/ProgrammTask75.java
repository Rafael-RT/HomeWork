package lesson07;

import java.util.Scanner;

public class ProgrammTask75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100000];
        int sum = 0;
        int i = 0;
        System.out.println("Enter numbers \n" +
                "if u want exit enter 0");

        do{
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        while (array[i] != 0);

        System.out.println("Sum of the all number: " + sum);

    }
}
