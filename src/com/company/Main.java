package com.company;
//import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here
        ArrayList<Books> booktittlarray = new ArrayList<Books>();

        Scanner scan = new Scanner(System.in);
        String Add = "";

        Books booktittle = new Books();
        System.out.println("Enter Tittle for the Book:");
        booktittle.setBooksTittle(scan.nextLine());
        booktittlarray.add(booktittle);

        do{

        Chapters chapternumbers = new Chapters();
        System.out.println("Enter Chapter for the Book:");
        chapternumbers.setChapterNo(scan.nextLine());
            do
            {
                Pages PageNo = new Pages();
                System.out.println("Enter PageNo for the Book:");
                PageNo.setPageNo(scan.nextLine());
                chapternumbers.getPageno().add(PageNo);
                System.out.println("Do you want to add more pages: Yes/No ");
                Add = scan.nextLine();
            }while(Add.equalsIgnoreCase("Yes"));

        booktittle.getChapterno().add(chapternumbers);
        System.out.println("Do you want to add more Chapter: Yes/No ");
        Add=scan.nextLine();

        }while(Add.equalsIgnoreCase("Yes"));

        for (Books abook : booktittlarray)
        {
            System.out.println("Tittle of the Book is: " + abook.getBooksTittle());

            for (Chapters achapter : abook.getChapterno())
            {
                System.out.println("The Chapter of the book is: " + achapter.getChapterNo());
                {

                    for (Pages apage : achapter.getPageno())
                    {
                        System.out.println("The Page of the Book: " + apage.getPageNo());
                    }

                }
            }
        }
      }
}

