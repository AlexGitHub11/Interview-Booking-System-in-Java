// This page is the same as loginSystem, this is why there are no comments,
// However the file path for both register and login has been changed to usernames&PasswordsManagement along with some variables and the function names.


package iapackage;
import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class loginSystemManagement {
    static Scanner fileScan;

    public static boolean loginMan(){

        String filepath = "usernames&PasswordsManagement.txt";

        boolean infoFound = false;

        String tempLogUser_name = "";
        String tempLogPass_word = "";

        String logUser_name = getManUserName();
        String logPass_word = getManUserPassword();

        try{
            fileScan = new Scanner(new File(filepath));
            fileScan.useDelimiter("[,\n]");

            while (fileScan.hasNext() && !infoFound){
                tempLogUser_name = fileScan.next();
                tempLogPass_word = fileScan.next();

                if (tempLogUser_name.trim().equals(logUser_name) && tempLogPass_word.trim().equals(logPass_word.trim())){
                    infoFound = true;
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("\nWelcome back, " + logUser_name + "!");
                }
            }
            fileScan.close();


        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();

        }

        return infoFound;
    }

    public static void registerMan(){

        Scanner registeruser = new Scanner(System.in);
        System.out.println("REGISTER");
        System.out.println("Enter username:");
        String regUser_name = registeruser.nextLine();
        System.out.println("Enter Password:");

        String regPass_word = registeruser.nextLine();

        try{
            FileWriter writeTwoFile = new FileWriter("usernames&PasswordsManagement.txt", true);

            writeTwoFile.write("\n" + regUser_name);
            writeTwoFile.write(", " + regPass_word);

            writeTwoFile.close();
            System.out.println("New User added, returning to landingPage");

            // Here I am calling the main method from the Main class,
            // I have had to declare the variables string and args because the main method uses,
            // both the string parameter adn args parameter.
            String[] args = {};
            Main.main(args);


        } catch (IOException e){
            System.out.println("Error");

            e.printStackTrace();
        }


    }

    public static String getManUserName(){


        Scanner loginuser = new Scanner(System.in);

        System.out.println("LOGIN");

        System.out.println("Enter username:");
        String logUser_name = loginuser.nextLine();

        return logUser_name;

    }

    public static String getManUserPassword(){

        Scanner loginuser = new Scanner(System.in);

        System.out.println("Enter Password:");
        String logPass_word = loginuser.nextLine();

        return logPass_word;

    }

}