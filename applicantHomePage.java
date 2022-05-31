package iapackage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class applicantHomePage {


    public static void home(){

        System.out.println("\nHOMEPAGE");
        System.out.println("1. Screening test");
        System.out.println("2. Applicant status");
        System.out.println("3. Return to landingPage");

        // new variable containing an integer.
        int usrChoice = 1;

        // Loop along as variable is 1.
        while (usrChoice == 1) {

            // New scanner.
            Scanner screenOrApp = new Scanner(System.in);

            // Print:
            System.out.println("\nEnter 1, 2 or 3:");

            // Storing user input in variables as integer.
            String usrsInpt = screenOrApp.nextLine();


            // If user input is 1
            if (usrsInpt.equals("1")) {

                isTestApproved object = new isTestApproved();
                // Here we are creating an object named loginSys so that the loginSystem class will return a true or false,
                // If true the following if statement will run, else will terminate.
                if (object.yesOrNo()) {

                    System.out.println("You have been granted access to the test");
                    applicantTest.test();
                }

                // if object returns false, print:
                else if (object.yesOrNo() == false){
                    System.out.println("\nYou test has not been approved, this could be either:\n");
                    System.out.println("Management have yet to accept,");
                    System.out.println("You have not requested a test from the view Status page,");
                    System.out.println("You have been refused a test\n");
                }

                else {
                    applicantHomePage.home();
                }


            }

            // If user input is 2.
            else if (usrsInpt.equals("2")) {

                // Call applicationStatus method from viewStatusPage class
                viewStatusPage.applicantStatus();

                // Set variable to 2 to break loop.
                usrChoice = 2;
            }

            else if (usrsInpt.equals("3")){

                // Here I am calling the main method from the Main class,
                // I have had to declare the variables string and args because the main method uses,
                // both the string parameter adn args parameter.
                String[] args = {};
                Main.main(args);

            }

            // Else user input is not 1 or 2.
            else {
                System.out.println("Input not recognised, Try Again: ");

            }

        }
    }
}
