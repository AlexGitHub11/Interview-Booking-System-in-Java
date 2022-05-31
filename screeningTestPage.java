package iapackage;

import java.util.Scanner;

// Creating class
public class screeningTestPage {

    // Creating method for screening test page
    public static void screeningPage(){

        // Print:
        System.out.println("Screening Test\n");

        System.out.println("Test Status: ");    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        // call test status
        // if test status is true && user input is 1
        // if user input is 1 && test status = false, return test not approved, would you like ot request a test

        System.out.println("1. Take Test");
        System.out.println("2. Return to Home");  //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        // Declaring a variable and setting it to an integer of 1,
        // This is for a while loop which will loop until a user input meets a condition
        int choice = 1;
        while (choice == 1) {

            // Declaring a new scanner
            Scanner takeOrView = new Scanner(System.in);

            // Print:
            System.out.println("\n Enter 1 or 2:");

            // Storing user input in variables as integer.
            int usrInpt = takeOrView.nextInt();

            // If the user input is 1,
            // call the method test from the applicationTest class.
            if (usrInpt == 1){
                applicantTest.test();

                // Break loop
                choice = 2;
            }

            if (usrInpt ==2 ){

                // Call home method from applicantHomePage
                applicantHomePage.home();

                // Break loop
                choice = 2;
            }

            // User input is not equal to 0
            else {
                System.out.println("Input not recognised, Try Again: ");

            }





        }
    }
}
