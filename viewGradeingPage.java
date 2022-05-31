package iapackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class viewGradeingPage {

    public static void view(){

        System.out.println("=========================================================================");
        System.out.println("                      SUCCESSFUL APPLICANT SCORES                        ");
        System.out.println("=========================================================================");
        System.out.println("NAME, SCORE:\n");


        // Here I am storing a file path into a variable with the file function,
        // then I am declaring a scanner and naming it reader, then I am passing the dile path variable into it,
        // then I hava a while loop and using the hasNextLine function i m storing each line into a variable named data,
        // next it is printing out the line and iterating back through until all data has been passed through the sout function.
        try{
            File getData = new File("successfulApplication&Scores.txt");
            Scanner reader = new Scanner(getData);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            System.out.println("\n=========================================================================");


            // Firstly I have closed the reading of the text file,
            // below we have a catch condition, this will find the error if user input is not expected,
            // Then it will print a message and then below that will print the error code.
            reader.close();
        } catch (IOException e) {
            System.out.println("Error");

            // Print the error code
            e.printStackTrace();


        }

        // Here I have declared a new integer and stored it in a variable, the int has been set to 1,
        // this has been done, so I can use it in the while loop below, allowing it to run until the loop variable is set to a different integer "breaking the loop".
        int loop = 1;
        while (loop == 1) {

            // Declaring a new scanner
            Scanner pageReturn = new Scanner(System.in);

            // Print:
            System.out.println("\nEnter 1 to return back to Management homepage:");

            // Storing user input in variables as string.
            int input = pageReturn.nextInt();

            // if user input is exactly equal to 1,
            // then call the home method from the managementHomePage class,
            // additionally set the loop variable to 2, breaking the loop.
            if (input == 1) {
                managementHomePage.home();
                loop = 2;

            }
            // Else print, here we don't set the loop to thing allowing the loop to continue until a condition is met.
            else {
                System.out.println("Error. Try again:");
                }

            }


    }
}
