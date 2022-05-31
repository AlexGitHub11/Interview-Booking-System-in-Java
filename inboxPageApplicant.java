// WHEN CALLING USERNAME WORK YOU NEED TO ADD THE NAME INTO THIS PAGE FOR BOTH SEND ADN RECIVE
// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//!!!!!!!!!!!!!!!!!!!!!
//!!!!!!!!!!!!!!!
//!!!!!!!!!!!


// This class is a part of the below package
package iapackage;

// Required utilities are imported below
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Creating the class
public class inboxPageApplicant {

    // Creating a method for the applicant to read messages
    public static void inbox(){

        // Print:
        System.out.println("=========================================================================");
        System.out.println("                               INBOX                                     ");
        System.out.println("=========================================================================");

        System.out.println("\n");


        // Here I am storing a file path into a variable with the file function,
        // then I am declaring a scanner and naming it reader, then I am passing the dile path variable into it,
        // then I hava a while loop and using the hasNextLine function i m storing each line into a variable named data,
        // next it is printing out the line and iterating back through until all data has been passed through the sout function.
        try{
            File getData = new File("inboxManagementToApplicant.txt");
            Scanner reader = new Scanner(getData);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }

            // Firstly I have closed the reading of the text file,
            // below we have a catch condition, this will find the error if user input is not expected,
            // Then it will print a message and then below that will print the error code.
            reader.close();
        } catch (IOException e) {
            System.out.println("Error");

            // Print the error code
            e.printStackTrace();

        }

        // Print:
        System.out.println("\n");
        System.out.println("=========================================================================\n");




        // Creating a new scanner
        Scanner inputForSend = new Scanner(System.in);

        // Print:
        // Append users name onto to the form string
        System.out.println("COMPOSE\n");
        // Print string plus calling the public usernameName variable from loginUser class.
        System.out.println("From: " + loginSystem.usernameName);
        System.out.println("To: Management");

        System.out.println("\nEnter Message (Do not press return until done):");

        // Store user input as a string in hte message variable
        String message = inputForSend.nextLine();

        // Here we hava a try condition, this will try the following code.
        // Here I am using the fileWriter method to allow me to add the name with a corresponding message to a txt file,
        // I have stored this in a variable and added the file name to write to
        // I have also added true to the end, this will append data not overwrite.
        try{
            FileWriter writeTwoFile = new FileWriter("inboxApplicantToManagement.txt", true);

            // Here we are using hte write method to append the txt file with a new line and the name of the user,
            // i pass the name in by calling the public usernameName variable from loginUser class.
            writeTwoFile.write("\n" + loginSystem.usernameName);

            // Here we are adding a comma next to the name of the user and then adding the string variable containing the user input.
            writeTwoFile.write(", " + message);

            // Then we are using the close method to close the writing, then printing a message that the message was written.
            writeTwoFile.close();
            System.out.println("Message Sent!");

            // Here we have a catch condition, this will find the error if user input is not expected,
            // Then it will print a message and then below that will print the error code.
        } catch (IOException e){
            System.out.println("Error");

            // Print the error code
            e.printStackTrace();
        }

        // Print:
        System.out.println("Returning you to homePage:");

        // calling home method from the applicantHomePage class
        applicantHomePage.home();

    }
}
