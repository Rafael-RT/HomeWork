package ProjectBook;

import java.util.Scanner;

public class BookDataBase {

    public static void main(String[] args) {
        int count = 0;
        String[] books = new String[100];

        Scanner in = new Scanner(System.in);

        while(true){

            System.out.println("Menu: \n" +
                    "1. Add book \n" +
                    "2. Delete book \n" +
                    "3. Edit name of book \n" +
                    "4. Show all book \n" +
                    "5. Find book \n" +
                    "6. Sorting book \n" +
                    "7. Exit");

            int menu = in.nextInt();

            switch (menu){
                ///Adding
                case 1:
                    System.out.println("Enter book's name");
                    String newString;
                    newString = in.next();
                    books[count++] = newString;

                    break;

                ///Deleting
                case 2:
                    if (check(books, count)) {
                        System.out.println("Data Base is empty");
                        break;
                    }

                    for (int j = 0; j < count; j++) {
                        System.out.println((j + 1) + ". " + books[j]);
                    }

                    System.out.println("Enter number of book that must be deleted");

                    int indexDelete = in.nextInt();

                    for (int j = indexDelete; j < count; j++) {
                        books[j - 1] = books[j];
                    }
                    count--;
                    break;

                ///Editing
                case 3:
                    if(check(books, count)){
                        System.out.println("Data Base is empty");
                        break;
                    }

                    for(int j = 0; j < count; j++)
                    {
                        System.out.println((j + 1) + ". " + books[j]);
                    }

                    System.out.println("Enter number of book that must be edited");

                    int indexEdit = in.nextInt();

                    System.out.println("Enter a new name of book");

                    books[indexEdit - 1] = in.nextLine();
                    break;


                ///Showing
                case 4:
                    if(check(books, count)){
                        System.out.println("Data Base is empty");
                        break;
                    }

                    for(int j = 0; j < count; j++)
                    {
                        System.out.println((j + 1) + ". " + books[j]);
                    }
                    break;


                ///Finding
                case 5:
                    if(check(books, count)){
                        System.out.println("Data Base is empty");
                        break;
                    }

                    System.out.println("Enter a name of book");
                    String bookFind = in.next();
                    int check = 0;
                    for(int j = 0; j < count; j++){
                        if(bookFind.equals(books[j])){
                            System.out.println("This book located with number " + (j + 1));
                            check++;
                        }
                    }
                    if(check == 0){
                        System.out.println("This book isn't");
                    }
                    break;


                ///Sorting
                case 6:
                    if(check(books, count)){
                        System.out.println("Data Base is empty");
                        break;
                    }

                    sort(books, count);

                    System.out.println("Sorted name of book");
                    for(int j = 0; j < count; j++)
                    {
                        System.out.println((j + 1) + ". " + books[j]);
                    }
                    break;

                //Exiting
                case 7:
                    System.exit(0);


                default:
                    break;
            }

            System.out.println("----------------------------------------");
        }
    }

    static boolean check(String[] strings, int count){
        int checkInt = 0;
        for(int i = 0; i < count; i++)
        {
            if(strings[i] == null)
                checkInt++;
        }

        if(checkInt == 0){
            return false;
        }
        else
            return true;
    }

    static void sort(String[] strings, int count){
        for(int i = 0; i < count - 1; i++){

            for(int j = 0; j < count - i - 1; j++){

                if(strings[j].compareTo(strings[j + 1]) > 0){
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
    }
}
