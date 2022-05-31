package iapackage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class requestForTest {

    public static String testRequest = "";

    public static void requestTest() {

        int loop = 1;
        while (loop == 1) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter 1 to request test or 2 to return: ");

            String requestChoice = scan.nextLine();

            if (requestChoice.equals("1")) {

                String filepath = "testRequests.txt";

                try {
                    FileWriter writeTwoFile = new FileWriter(filepath, true);

                    writeTwoFile.write("\n" + loginSystem.usernameName);

                    writeTwoFile.close();
                    System.out.println("Request sent, status will be updated when changes have been made");

                    testRequest = "Requested";

                } catch (IOException e) {
                    System.out.println("Error");

                    e.printStackTrace();
                }

                loop = 2;

            } else if (requestChoice.equals("2")) {

                loop = 2;

            } else {
                System.out.println("Input not recognised, try again:");

            }


        }

    }

}
