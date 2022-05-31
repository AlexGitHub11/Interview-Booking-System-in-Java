package iapackage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class isTestApproved {

    static Scanner fileScan;

    public static boolean yesOrNo() {

        String filepath = "testRequestsApproved.txt";

        boolean infoFound = false;

        String tempName = "";

        try {
            fileScan = new Scanner(new File(filepath));
            fileScan.useDelimiter("[,\n]");

            while (fileScan.hasNext() && !infoFound) {
                tempName = fileScan.next();

                // This page derives a lot from the log in method however here we are only returning a true value from the
                // method if the below if statement is met.
                if (tempName.trim().equals(loginSystem.usernameName)) {
                    infoFound = true;

                }

            }
            fileScan.close();


        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();

        }

        return infoFound;
    }
}
