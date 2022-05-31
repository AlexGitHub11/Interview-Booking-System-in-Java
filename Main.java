// Alexander Richford (SID:2106578)
// Element 010 group name: AFM

// Some features my team implemented in the first assignment were too complicated for me to create in java due to this being my first,
// experience with the programming language. The exceptions are listed and explained below:

// Test configuration page
// One feature we designed our project was allowed the management to have a build in IDE where they could format questions themselves,
// I have not produced this work because when trying to i couldn't understand how to integrate a second ide into a terminal programme,

// communication with application and desktop calendar programme
// I did not make my programme connect with the users desktop calendar due to teh complexity of getting the two programmes to work together.

// Interview booked page
// I have not created this page either because it was heavily dependent on being a GUI,
// because of this I have included the relevant information on the view status page.

// End of exception descriptions.

// For an explanation and instructions on how to use this programme please find the readMe text file.


// Here I have created my package for the application, this is where all my java filed will be located, so they can access each other.
package iapackage;

// Here I have the utilities I have imported that are required in my code:
import javax.script.ScriptContext;
import java.util.Scanner;

// Here is my public class I have named Main.
public class Main {

    // Here I have initialised my main method.
    public static void main(String[] args) {

        // Here I am calling a simple class to present a logo on the terminal to a user.
        logo.printLogo();

        // Below I am printing out strings to the terminal, I am also making use of the \n or new line.
        System.out.println("\n");
        System.out.println("Welcome To The Intergence Applicant Interview Application! ");

        System.out.println("\nEnter 1 for Applicant");
        System.out.println("Enter 2 for Management");

        Scanner appOrMann = new Scanner(System.in);

        // Declaring a new variable with the value of 1 and the datatype == integer.
        int appOrMannChoice = 1;

        // Declaring a while loop,
        // along as the appOrMannChoice variable is equal to 1 the while loop will loop,
        while (appOrMannChoice == 1) {

            int whichUserType = appOrMann.nextInt();

            if (whichUserType == 1) {
                // Breaking while loop.
                appOrMannChoice = 2;

                System.out.println("\n1. Login");
                System.out.println("2. Register");

                // Below I am initialising a scanner for the user to make a choice, either for log in or registration.
                Scanner logOrReg = new Scanner(System.in);

                // Here I am setting a variable to the int 1 to be used in a while loop.
                int landingPage = 1;

                // Here I have started a while loop,
                // The loop will run while the condition of the variable landingpage is equal to the int 1.
                while (landingPage == 1) {

                    // Printing instructions to user
                    System.out.println("Enter 1 or 2:");

                    // Here I am storing the user input in a variable with the int data type, due to the input being a number.
                    int logOrRegChoice = logOrReg.nextInt();

                    // Here I have created an if statement,
                    // If the user input equal to one the log in method from the loginSystem class will be called.
                    if (logOrRegChoice == 1) {
                        loginSystem loginSys = new loginSystem();
                        // Here we are creating an object named loginSys so that the loginSystem class will return a true or false,
                        // If true the following if statement will run, else will terminate.
                        if (loginSys.login()) {

                            // new variable containing an integer.
                            int usrChoice = 1;

                            // Loop aslong as variable is 1.
                            while (usrChoice == 1) {

                                // Calling home method from applicantHomePage class
                                applicantHomePage.home();

                                // Breaking loop
                                landingPage = 2;

                            }

                        }
                    }

                    // Here I have created an if statement,
                    // If the user input equal to two the register method from the login system class will be called.
                    if (logOrRegChoice == 2) {
                        loginSystem.register();
                        landingPage = 2;

                        // Here I have added an if statement, this will run if the user inputs a non recognised value,
                        // Here I have an is statement, if user input is not equal to either 1 or 2 then print below statement.
                        // After the print statement has been displayed the landingPage while loop will loop through again.
                    }

                    // else:
                    else {
                        System.out.println("Input not recognised, Try Again: ");

                    }
                }

            }

            if (whichUserType == 2) {
                // Breaking while loop.1
                appOrMannChoice = 2;
                System.out.println("\n1. Login");
                System.out.println("2. Register");

                Scanner logOrRegMan = new Scanner(System.in);
                int landingPageMan = 1;

                while (landingPageMan == 1) {
                    System.out.println("Enter 1 or 2:");

                    int logOrRegManChoice = logOrRegMan.nextInt();

                    if (logOrRegManChoice == 1) {
                        loginSystemManagement loginSysMan = new loginSystemManagement();

                        if (loginSysMan.loginMan()) {

                            // Creating a new variable and setting it to int 1
                            int managementHomePageChoice = 1;

                            // Using above variable for a while loop for the choice
                            while (managementHomePageChoice == 1) {

                                // Here we are calling the home method from the managementHomePage class,
                                // I have used a method for this so the home method can be accessed in different classes.
                                managementHomePage.home();

                                // Break loop
                                landingPageMan = 2;
                            }

                        }
                        else {
                            System.out.println("Input not recognised, Try Again: ");
                            System.out.println("\n1. Login");
                            System.out.println("2. Register");
                        }

                    }

                    if (logOrRegManChoice == 2) {
                        loginSystemManagement.registerMan();
                        landingPageMan = 2;

                    }

                }

              // Else print for while loop.
            } else {
                System.out.println("Input not recognised, Try Again: ");

            }

        }
    }

}
