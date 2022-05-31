// This class belongs in my application package.
package iapackage;

// Here I have the utilities I have imported that are required in my code:
import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


// Here I am creating the public class.
public class loginSystem {

    // Here I am declaring a new public variable with an empty string attached,
    // later I will call the username string into this variable, so I can return the name throughout the program
    // by calling this variable through the login system class.
    public static String usernameName = "";

    // Here I have initialised a private scanner,
    // This scanner will be used to store the data from the txt file.
     static Scanner fileScan;

    // Here I am creating the method login for users to log into there existing accounts.
    // Void indicates that we are not returning a value.
    // Here I have added the boolean because I want the function ot return a true or false for the main method.
    public static boolean login(){

        // Here I am creating a string variable with the location of the usernames and passwords.
        String filepath = "usernames&Passwords.txt";

        // Here I have declared a boolean variable to false,
        // this has been done later in our try function we can use it to keep iterating through the txt file until the credentials have been found.
        boolean infoFound = false;

        // Here I have created two variables with the string data type,
        // Thies variables will hold the username and passwords in the txt file,
        // then they will get compared with the equal function to the user input and password.
        String tempLogUser_name = "";
        String tempLogPass_word = "";

        // Here we are calling two methods and storing their returned value in a strings, these methods get the user input for the username and password,
        // I have done this so that I can return the username or user password in the method to any class I want.
        String logUser_name = getUserName();

        usernameName = logUser_name;

        String logPass_word = getUserPassword();

        // Here we have created a try statement,
        // This will first use the fileScan scanner to read the txt file through its variable name,
        // Then I have used the .useDelimiter, this method will read each value until the comma or new line.
        try{
            fileScan = new Scanner(new File(filepath));
            fileScan.useDelimiter("[,\n]");

            // Here I have created a while loop,
            // This while loop goes through the txt file as long as our boolean is still false.
            while (fileScan.hasNext() && !infoFound){
                // tempLogUser_name will go through the txt file until the first comma or new line and store that value.
                tempLogUser_name = fileScan.next();
                // tempLogPass_word will go through the txt file until the first comma or new line and store that value.
                tempLogPass_word = fileScan.next();

                // Here is an if statement that is comparing our temp variables with the user input via the .equals function, if all four values are equal the user can log in.
                if (tempLogUser_name.trim().equals(logUser_name) && tempLogPass_word.trim().equals(logPass_word.trim())){

                    // Set boolean value to true.
                    infoFound = true;
                    // Print personalised welcome message on new line by using user input variable to retrieve username.
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("\nWelcome back, " + logUser_name + "!");
                }
            }
            // Close scanner.
            fileScan.close();


            // Here we have a catch condition, this will find the error,
            // Then it will print a message and then below that will print the error code.
        }catch (IOException e){
            System.out.println("Error");

            // Print the error code
            e.printStackTrace();

        }
        // Return true or false for the main method if statement.
        return infoFound;
    }

    // Here I am creating the method register, so users can create an account.
    // Void because I am not returning a value.
    public static void register(){

        // Here I have started a new scanner for the user input.
        Scanner registeruser = new Scanner(System.in);

        // Print to terminal.
        System.out.println("REGISTER");

        // Print message then store user input as a string in the regUsername variable.
        System.out.println("Enter username:");
        String regUser_name = registeruser.nextLine();

        System.out.println("Enter Password:");

        // Store input as string in the regPassword variable.
        String regPass_word = registeruser.nextLine();

        // Here we hava a try condition, this will try the following code.
        try{
            // Here I am using the fileWriter method to allow me to add the username and password to a txt file,
            // I have stored this in a variable and added a new file name to be created.
            // I have also added true to the end, this will append data not overwrite.
            FileWriter writeTwoFile = new FileWriter("usernames&Passwords.txt", true);



            // Here I am writing hte contents fo the regUsername variable into the file.
            writeTwoFile.write("\n" + regUser_name);

            // Here I am writing the contents of the regPassword to the file and have used the \n to put the password on a new line.
            writeTwoFile.write(", " + regPass_word);

            // Once I have written to the file I close it.
            writeTwoFile.close();
            // Print:
            System.out.println("New User added, Returning to landingPage.");

            // Here I am calling the main method from the Main class,
            // I have had to declare the variables string and args because the main method uses,
            // both the string parameter adn args parameter.
            String[] args = {};
            Main.main(args);


            // Here we have a catch condition, this will find the error if user input is not expected,
            // Then it will print a message and then below that will print the error code.
        } catch (IOException e){
            System.out.println("Error");

            // Print the error code
            e.printStackTrace();
        }


    }

    // Here I have created a new method,
    // I Have done this so that I can return a string allowing me to call that string into other variables,
    // the reason I did this in a separate method is because you can only return one value from each method.
    public static String getUserName(){

        // Here I have started a new scanner for the user input.
        // This scanner will get the user input for the login.
        Scanner loginuser = new Scanner(System.in);

        // Print to screen;
        System.out.println("LOGIN");

        // Print message,
        // Then store the input as a string in hte logUser_name variable.
        System.out.println("Enter username:");
        String logUser_name = loginuser.nextLine();

        return logUser_name;

    }

    // Here I have created a new method,
    // I Have done this so that I can return a string allowing me to call that string into other variables,
    // the reason I did this in a separate method is because you can only return one value from each method.
    public static String getUserPassword(){

        // Here I have started a new scanner for the user input.
        // This scanner will get the user input for the login.
        Scanner loginuser = new Scanner(System.in);

        // Print message,
        // Then store the input as a string in the logPass_word variable.
        System.out.println("Enter Password:");
        String logPass_word = loginuser.nextLine();

        return logPass_word;

    }


}


