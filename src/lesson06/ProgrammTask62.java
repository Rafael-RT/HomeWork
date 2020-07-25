package lesson06;

import java.util.Arrays;

public class ProgrammTask62 {
    public static void main(String[] args) {
        /*
        int[] array = new int[10];

        for(int i = 0; i < array.length;)
        {
            array[i] = ++i;
        }
        */
        int[] array = new int[10];
        int[] reverse = new int[array.length];
        int j = reverse.length - 1;

        for(int i = 0; i < array.length;)
        {
            reverse[j--] = array[i] = ++i;
        }

        System.out.println("Array " + Arrays.toString(array));
        System.out.println("Reverse Array " + Arrays.toString(reverse));
    }
}
