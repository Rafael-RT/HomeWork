package lesson5;

public class Programm54 {
    public static void main(String[] args) {
        int a = 10;
        int c = a;
        int b = ++a;
        if (b >= a){
            if (c == 10){
                if ((c <= b) && (c != b)){  // a is changed to c
                    System.out.println("All statements are true.");
                } else {
                    System.out.println("One of the statements isn't true.");
                }
            } else {
                System.out.println("One of statements is true.");
            }
        } else {
            System.out.println("All statements are false");
        }

        /*
        if (b >= a){
            if (c == 10){
                if ((c <= b) && (a != b)){
                    System.out.println("All statements are true.");
                } else {
                    System.out.println("One of the statements isn't true."); // it should be showed
                }
            } else {
                System.out.println("One of statements is true.");
            }
        } else {
            System.out.println("All statements are false");
        }
         */
    }
}
