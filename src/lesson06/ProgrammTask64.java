package lesson06;

import java.util.Arrays;

public class ProgrammTask64 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
            swap(array, 1, 2);
            swap(array, 1, 3);
            swap(array, -1, 0);

        int[] array2 = new int[]{2, 4, 6, 8, 10};
            swap(array2, 2, 3);
            swap(array2, 4, 5);
            swap(array2, -2, 0);
            swap(array2,-1,5);
    }

    private static void swap(int[] array, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);

        if((indexB < 0 || indexB >= array.length) && (indexA < 0 || indexA >= array.length))
        {
            System.out.println("IndexA (" + indexA + ") incorrect and IndexB (" + indexB + ") incorrect!");
        }
        else if(indexB < 0 || indexB >= array.length)
        {
            System.out.println("IndexB (" + indexB + ") incorrect!");
        }
        else if (indexA < 0 || indexA >= array.length)
        {
            System.out.println("IndexA (" + indexA + ") incorrect!");
        }
        else {
            int temp = array[indexA];
            array[indexA] = array[indexB];
            array[indexB] = temp;
        }
        System.out.println("Result: " + Arrays.toString(array) + "\n");
    }
}
