package com.java111.Evaluation4.Question2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Main main = new Main();
        Library library = new Library();
        try {


            while (true) {
                System.out.print("Enter book name : ");
                String bookName = sc.next();
                System.out.print("Enter Author name : ");
                String authorName = sc.next();
                Book book = new Book(bookName, authorName);
                library.addBook(book);

                System.out.print("1 for exit and 0 for continue : ");
                int command = sc.nextInt();

                if (command == 1) {
                    break;
                }
            }
            System.out.println("===================================================================");
            {
                System.out.print("Do you want see all book in library press 1 : ");
                int q = sc.nextInt();
                if (q == 1) {
                    System.out.println("All book details ");
                    main.displayBookDetail(library);
                }
                System.out.print("Do you want to Exit from Library press 1 ");
                int ex = sc.nextInt();
                if (ex == 1) {
                    return;
                }

            }


            {
                System.out.print("Do you want book by Author name Press 1 : ");
                int command = sc.nextInt();
                if (command == 1) {
                    System.out.print("Author name : ");
                    String aName = sc.next();
                    List<Book> bookName = library.viewBookByAuthor(aName);
                    for (Book b : bookName) {
                        System.out.println(b.getBookName() + "---by---" + b.getAuthor());
                    }
                }
                System.out.print("Do you want to Exit from Library press 1 ");
                int ex = sc.nextInt();
                if (ex == 1) {
                    return;
                }
            }
            System.out.println("===================================================================");
            {
                System.out.print("Do you want to number of book by desired  book Name press 1 : ");
                int command = sc.nextInt();
                if (command == 1) {
                    System.out.print("Enter book name :  ");
                    String bName = sc.next();
                    int count = library.countNoOfBook(bName);
                    System.out.println("Number of book in the Library which name is " + bName + " => " + count);
                }
                System.out.print("Do you want to Exit from Library press 1 ");
                int ex = sc.nextInt();
                if (ex == 1) {
                    return;
                }
            }
            System.out.println("===================================================================");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayBookDetail(Library library) {

        for (Book b : library.bookList) {
            System.out.println(b.getBookName() + "--- by ---" + b.getAuthor());
        }
    }
}
