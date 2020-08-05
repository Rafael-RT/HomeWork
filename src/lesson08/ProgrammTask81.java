package lesson08;

import java.util.Scanner;

public class ProgrammTask81 {
    public static void main(String[] args) {

        method1();

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = s.nextInt();

        method2(num);

        System.out.println("Enter 2 number, the first must be less than the second");
        int a1 = s.nextInt();
        int a2 = s.nextInt();
        if(a1 >= a2) {
            do {
                System.out.println("Enter second number again");
                a2 = s.nextInt();
            }
            while (a1 >= a2);
        }

        method3(a1,a2);

        System.out.println("\nEnter the 3 sides of the triangle");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        method4(a,b,c);


    }

    public static void method1(){

        for(int i = 1; i < 21; i++)
        {
            if(i % 2 == 1)
                System.out.print(i);
            else
                System.out.println("   " + i);
        }

    }

    public static void method2(int a){
        int sum = 0;
        for(int i = 1; i <= a; i++)
        {
            sum += i;
        }
        System.out.println("Sum of numbers from 1: " + sum);
    }

    public static void method3(int a, int b) {
        System.out.println("The number which divisible by 3 ");
        for(int i = a; i <= b; i++) {
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void method4(int a, int b, int c){
        if((a + b > c) && (a < b + c) && (a + c > b)){
            System.out.println("Triangle exist");
        }
        else
            System.out.println("Triangle don't exist");
    }
}
