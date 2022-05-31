package iapackage;

import java.util.Scanner;

public class managementHomePage {

    public static void home(){

        // Creating a new variable and setting it to int 1
        int managementHomePageChoice = 1;

        // Using above variable for a while loop for the choice
        while (managementHomePageChoice == 1) {

            // Print:
            System.out.println("\n1. Manage Applicant's Requests");
            System.out.println("2. View Grading");
            System.out.println("3. Update Applicant's Status");
            System.out.println("4. Inbox");
            System.out.println("5. Return to landingPage");

            // New scanner.
            Scanner manageViewOrUpdte = new Scanner(System.in);

            // Print:

            System.out.println("\nEnter 1, 2, 3, 4, or 5");

            // Storing user input in variables as string.
            String userinptMVU = manageViewOrUpdte.nextLine();

            // If user input = 1
            if (userinptMVU.equals("1")) {
                System.out.println("Manage Applicant's Requests");

                manageApplicantRequestPage.acceptOrDeny();

                // Break loop
                managementHomePageChoice = 2;
            }

            else if (userinptMVU.equals("2")) {
                System.out.println("View Grading");

                // Calling the view method within the viewGrading page class
                viewGradeingPage.view();

                // Break loop
                managementHomePageChoice = 2;
            }

            else if (userinptMVU.equals("3")) {
                System.out.println("Update Applicant's Status");

                updateApplicantsStatusPage.bookInterview();

                // Break loop
                managementHomePageChoice = 2;
            }

            else if (userinptMVU.equals("4")){

                    // Calling the inboxMan method from the inboxPageManagement
                    inboxPageManagement.inboxMan();

                    // Break loop
                    managementHomePageChoice = 2;
                }

            else if (userinptMVU.equals("5")){

                // Here I am calling the main method from the Main class,
                // I have had to declare the variables string and args because the main method uses,
                // both the string parameter adn args parameter.
                String[] args = {};
                Main.main(args);

            }

            else {
                System.out.println("Input not recognised, try again.");
            }

        }

        }
}
