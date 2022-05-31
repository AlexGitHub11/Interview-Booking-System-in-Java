package iapackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class updateApplicantsStatusPage {

    public static String applicantInterviewStatus = "";

    // Here I have initialised a private scanner,
    // This scanner will be used to store the data from the txt file.
    static Scanner fileScan;

    // declaring a new method
    public static void bookInterview(){

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

        // defining a while loop
        int num = 1;
        while (num == 1) {

            // Print
            System.out.println("\nEnter who you would like to book for an interview,");
            System.out.println("When done enter FINISH\n");

            // new scanner
            Scanner input = new Scanner(System.in);

            System.out.println("Enter here: ");

            // Storing user input in variables as string.
            String name = input.nextLine();

            // Here I am creating a string variable with the location of the test requests
            String filepath = "successfulApplication&Scores.txt";

            // Here I have declared a boolean variable to false,
            // this has been done later in our try function we can use it to keep iterating through the txt file until the credentials value has been found.
            boolean infoFound = false;

            // Here I have created an empty variable which will be used to iterate through a text file in a while loop.
            String userName = "";

            // Here we have created a try statement,
            // This will first use the fileScan scanner to read the txt file through its variable name,
            // Then I have used the .useDelimiter, this method will read each value until the comma or new line.
            try {
                fileScan = new Scanner(new File(filepath));
                fileScan.useDelimiter("[,\n]");

                // Here I have created a while loop,
                // This while loop goes through the txt file as long as our boolean is still false.
                while (fileScan.hasNext() && !infoFound) {
                    // userName will go through the txt file until the first comma or new line and store that value.
                    userName = fileScan.next();

                    // Here is an if statement that is comparing our temp variables with the user input via the .equals function, if the value in the txt file matches the input
                    // the code within the if statement will run
                    if (userName.trim().equals(name)) {

                        // Set boolean value to true.
                        infoFound = true;

                        try {
                            FileWriter writeTwoFile = new FileWriter("bookedApplicants.txt", true);

                            // Here we are using hte write method to append the txt file with a new line and the name of the user,
                            // I pass the name in by calling the public usernameName variable from loginUser class.
                            writeTwoFile.write("\n" + name);

                            writeTwoFile.write(", " + "Interview booked");

                            // Then we are using the close method to close the writing, then printing a message that the message was written.
                            writeTwoFile.close();
                            System.out.println("Interview booked");

                            // Adding a string to the static variable
                            applicantInterviewStatus = "Interview Booked at our Cambridge establishment,\nTo find out how to get to us follow the link https://www.intergence.com/contact-us";

                            // Here we have a catch condition, this will find the error if user input is not expected,
                            // Then it will print a message and then below that will print the error code.
                        } catch (IOException e) {
                            System.out.println("Error");

                            // Print the error code
                            e.printStackTrace();
                        }

                    }

                }
                // Close scanner.
                fileScan.close();
                System.out.println(infoFound);

                // Here we have a catch condition, this will find the error,
                // Then it will print a message and then below that will print the error code.
            } catch (IOException e) {
                System.out.println("Error");

                // Print the error code
                e.printStackTrace();

                // Break loop
                num = 2;

            }

            // If input == FINISH break loop and call acceptOrDeny method
            if(name.equals("FINISH")){

                num = 2;
            }


        }

    }

}
