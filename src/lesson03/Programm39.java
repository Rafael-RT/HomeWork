public class Programm39 {
    public static void main(String[] args) {

        int x = 1; //primitive data type
        Integer x1 = 1; // reference data type

        //difference is that reference data type related
        //with classes and can call method of this class
        boolean a = x1.equals(1);

        //Ans1: primitive data and reference to object stored in stack
        //object of any class stored in heap. For ex.:
        String y = "This object stored in heap"; // y stored reference to object in stack

        /*
          Ans2: Size of Wrapper classes:
          Integer - 16 bytes
          Long - 24 bytes
          Double 24 bytes
          Boolean-16 bytes

         */

    }
}
