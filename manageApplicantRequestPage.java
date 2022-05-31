package iapackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class manageApplicantRequestPage {

    // Here I have initialised a private scanner,
    // This scanner will be used to store the data from the txt file.
    static Scanner fileScan;


    public static void acceptOrDeny(){

        System.out.println("=========================================================================");
        System.out.println("                Applicants who have requested a test                     ");
        System.out.println("=========================================================================");

        // Here I am storing a file path into a variable with the file function,
        // then I am declaring a scanner and naming it reader, then I am passing the dile path variable into it,
        // then I hava a while loop and using the hasNextLine function i m storing each line into a variable named data,
        // next it is printing out the line and iterating back through until all data has been passed through the sout function.
        try{
            File getData = new File("testRequests.txt");
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
        System.out.println("=========================================================================");

        int num = 1;

        while (num == 1){


            // Print
            System.out.println("Enter 1 to accept, or 3 to return to the homepage:");

            // new scanner
            Scanner choice = new Scanner(System.in);

            // Storing user input in variables as string.
            String userInput = choice.nextLine();

            if (userInput.equals("1")){

                // calling accept method
                accept();

                // Break
                num = 2;

            }

            else if (userInput.equals("3")){

                // calling home method from managementHomePage class
                managementHomePage.home();

                // Break
                num = 2;

            }

            else{
                System.out.println("Input not valid, try again: ");
            }

        }

    }

    // declaring a new method
    public static void accept(){

        // defining a while loop
        int num = 1;
        while (num == 1) {

            // Print
            System.out.println("Enter who you would like to accept,");
            System.out.println("When done enter FINISH\n");

            // new scanner
            Scanner input = new Scanner(System.in);

            System.out.println("Enter here: ");

            // Storing user input in variables as string.
            String name = input.nextLine();

            // Here I am creating a string variable with the location of the test requests
            String filepath = "testRequests.txt";

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
                            FileWriter writeTwoFile = new FileWriter("testRequestsApproved.txt", true);

                            // Here we are using hte write method to append the txt file with a new line and the name of the user,
                            // i pass the name in by calling the public usernameName variable from loginUser class.
                            writeTwoFile.write("\n" + name);

                            // Then we are using the close method to close the writing, then printing a message that the message was written.
                            writeTwoFile.close();
                            System.out.println("Applicant accepted!");

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
                acceptOrDeny();
                num = 2;
            }


        }

    }

}
