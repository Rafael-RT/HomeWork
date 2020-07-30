package lesson07;

import java.util.Scanner;

public class ProgrammTask76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        int[] array = new int[(int)Math.log10(num)];
        for(int i = 0; i < array.length; i++) {
            array[i] = num%10;
            num/=10;
        }

        boolean check = true;
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++)
            {
                if(array[i] == array[j] && i != j)
                {
                    System.out.println("Yes");
                    check = false;
                    break;
                }
            }
            if(!check)
                break;
        }

        if(check){
            System.out.println("The integer has not a duplicate numbers");
        }
    }
}
