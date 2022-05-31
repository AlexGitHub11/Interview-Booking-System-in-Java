package iapackage;

// Importing needed utilities
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


// Creating a class
public class viewStatusPage {


    // Here I am declaring a new public variable with an empty string attached,
    // later I will call the description string into this variable, so I can return it throughout the program
    // by calling this variable through the class.
    public static String userDescription = "";

    public static String userStatus = "";


    // Creating a method to get the info of applicant status
    public static void applicantStatus(){

        // creating a while loop and setting the loop to 1,
        // this is to loop until an input meets a condition.
        int loop = 1;
        while (loop == 1) {

            System.out.println("View Status Page\n");

            // Print string plus username from the variable being called from the requestForTest class.
            System.out.println("Applicant status: " + requestForTest.testRequest);

            // Print string plus username from the variable being called from the loginUser class.
            System.out.println("Applicant name: " + loginSystem.usernameName);

            // Print string plus variable declared at top of class which will return the value of the description variable.
            System.out.println("Description: " + userDescription);

            // Print string plus call the variable containing the test status variable from the applicantTest class.
            System.out.println("Test status: " + applicantTest.testStatus);

            // Print string plus variable declared in another class which will return the score as a string.
            System.out.println("Test score: " + applicantTest.callTestScore + " / 10");

            // Print plus variable being called from class
            System.out.println("Interview Status: " + updateApplicantsStatusPage.applicantInterviewStatus);

            // Here us an if statement that will return a link to the contact page of Intergence website and a interview date,
            // if the statement returns true.
            if(updateApplicantsStatusPage.applicantInterviewStatus == "Interview Booked at our Cambridge establishment,\nTo find out how to get to us follow the link https://www.intergence.com/contact-us"){

                // Print:
                System.out.println("\nYour interview will be:");

                // Here I am declaring a new variable with the inbuilt utility Date in the java library
                Date date = new Date();

                // Here I am declaring a calendar, this is so we can pass the date and time though it, this allows us to amend the date,
                // firstly I have stored the date in a variable using the .getInstance(), this is then stored in the Calendar object,
                Calendar convertToCalendar = Calendar.getInstance();
                convertToCalendar.setTime(date);

                // here we are adding a week onto the returning date by adding to the calendar object,
                // the DATE method means we want to add a whole day and the 7 is the value of days (1 week).
                convertToCalendar.add(Calendar.DATE, 7);

                // Converting calendar back into date, so I can return it to screen
                Date dateAddWeek = convertToCalendar.getTime();

                // Print out dateAddWeek variable (current date plus a week)
                System.out.println(dateAddWeek);

            }

            System.out.println("\n");

            // Call method description:
            description();

            // Declaring new scanner
            Scanner done = new Scanner(System.in);

            // Print:
            System.out.println("Enter 1 to return to home, 2 to go to inbox or 3 to request test: ");

            // Storing user input in variables as string.
            String input = done.nextLine();

            if (input.equals("1")){

                // calling home method from applicantHomePage
                applicantHomePage.home();

                // Breaking loop
                loop = 2;
            }

            else if (input.equals("2")){

                // Call inbox method from inboxPageApplicant class
                inboxPageApplicant.inbox();

                // Breaking loop
                loop = 2;
            }

            else if (input.equals("3")){

                // Call requestTest method from requestForTest class
                requestForTest.requestTest();

                // Breaking loop
                loop = 2;
            }


            // Print:
            else {
                System.out.println("Error, Try Again");
            }

        }

    }

    public static void description(){

        int loop = 1;
        while (loop == 1){

            // Declaring new scanner
            Scanner scan = new Scanner(System.in);

            // Print:
            System.out.println("\nWant to add more information about yourself? 1 for yes 2 for no:");

            // Storing user input in variables as string.
            String yesOrNo = scan.nextLine();

            if (yesOrNo.equals("1")){

                Scanner scan1 = new Scanner(System.in);

                System.out.println("Add your degree and previous job title, eg Cyber Security, Data analyst.\nType here: ");

                // Storing user input in variables as string.
                String description = scan.nextLine();

                // Setting the string of userDescription to the value of description.
                userDescription = description;

                // Break loop
                loop = 2;

            }

            // Here i have an else if statement of the second option,
            // having an else if statement stops the else statement from always returning.
            else if (yesOrNo.equals("2")){

                // Break loop
                loop = 2;

            }

            else{
                System.out.println("Error, try again:");
            }

        }
    }



}
