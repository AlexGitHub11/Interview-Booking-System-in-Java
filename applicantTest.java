package iapackage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

// Creating the new class.
public class applicantTest {

    // Here I am declaring a new public variable with an empty string attached,
    // later I will call  a string into this variable, so I can return it throughout the program
    // by calling this variable through the class.
    public static String callTestScore = "";

    public static String testStatus = "";

    // Creating a new function.
    public static void test(){

        // Setting testStatus variable to the string "Attempted"
        testStatus = "Attempted";

        // Print:
        System.out.println("Take Test");

        // Creating a variable with the int 1 for a while condition.
        int testChoice = 1;

        // Create a while loop and run as long as the variable is equal to 1.
        while (testChoice == 1) {

            // New scanner to get user input
            Scanner testStart = new Scanner(System.in);

            // Print:
            System.out.println("\nEnter yes to take test: ");

            // Storing user inpit in variables as string.
            String usrInput = testStart.nextLine();

            // If user input equals yes or Yes or YES.
            if (usrInput.equals("yes") || usrInput.equals("Yes") || usrInput.equals("YES")) {


                // New variable with the long data type and the System.currentTimeMills method, this returns the current time.
                // I will be using this later to get the time taken for the test.
                long testStartTime = System.currentTimeMillis();

                // Setting a variable as integer 0, this will get incremented with every correct answer.
                int marks = 0;

                // Print:
                System.out.println("Question 1\n");
                System.out.println("What cable is used for networking hardware together:");
                System.out.println("NAT 3.2");
                System.out.println("GAT 5");
                System.out.println("CAT 5");
                System.out.println("CAT 11");


                Scanner q1 = new Scanner(System.in);

                // try catch statement to handel with errors.
                try {

                    // Print:
                    System.out.println("\nEnter your answer as shown: ");

                    // Storing user input in variables as string.
                    String q1usrninpt = q1.nextLine();

                    if (q1usrninpt.equals("CAT 5")) {
                        marks++;
                    } else {
                        System.out.println(" ");
                    }
                }catch(Exception e){
                    System.out.println("You entered an unrecognised input!");
                }

                // Print:
                System.out.println("Question 2");
                System.out.println("What is the loop back address:");
                System.out.println("127.0.0.1");
                System.out.println("127.0.1.1");
                System.out.println("127.1.1.1");
                System.out.println("255.255.254");

                Scanner q2 = new Scanner(System.in);

                try {

                    // Print:
                    System.out.println("\nEnter your answer as shown: ");

                    // Storing user input in variables as string.
                    String q2UsrnInpt = q2.nextLine();

                    if (q2UsrnInpt.equals("127.0.0.1")) {
                        marks++;
                    } else {
                        System.out.println(" ");
                    }

                }catch(Exception e){
                    System.out.println("You entered an unrecognised input!");
                }

                // Print:
                System.out.println("Question 3");

                // Setting boolean variable to false
                boolean q3answer = false;

                // print:
                System.out.println("How Many layers in the OSI model:");

                // Question 3 scanner
                Scanner q3 = new Scanner(System.in);

                try {

                    // Storing user input in variables as string.
                    String q3UsrnInpt = q3.nextLine();

                    // if user input = 7, boolean is true and mark adds 1.
                    if (q3UsrnInpt.equals("7")) {
                        q3answer = true;
                        marks++;
                    }
                    // else print:
                    else {
                        System.out.println(" ");
                    }

                }catch(Exception e){
                    System.out.println("You entered an unrecognised input!");
                }

                // Print:
                System.out.println("Question 4");

                // Setting boolean variable to false
                boolean q4answer = false;

                // print:
                System.out.println("How many bits are in a IPV4 address:");

                // Question 4 scanner
                Scanner q4 = new Scanner(System.in);

                try {

                    // Storing user input in variables as string.
                    String q4UsrnInpt = q4.nextLine();

                    // if user input = 32, boolean is true and mark adds 1.
                    if (q4UsrnInpt.equals("32")) {
                        q3answer = true;
                        marks++;
                    }
                    // else print:
                    else {
                        System.out.println(" ");
                    }

                }catch(Exception e){
                    System.out.println("You entered an unrecognised input!");
                }

                // Print:
                System.out.println("Question 5");

                // Print:
                System.out.println("\nThe below outputs are from this array:");
                System.out.println("String[] q5Array = {\"JAVA\", \"PYTHON\", \"C\", \"SQL\", \"HTML\"};");

                // New Scanner for question 5
                Scanner q5 = new Scanner(System.in);

                // After new line I have created an array for this question.
                System.out.println("\n");
                String[] q5Array = {"JAVA", "PYTHON", "C", "SQL", "HTML"};

                // Here i have done a for loop to iterate and print all the values out.
                for (int row = 0; row < 5; row++) {
                    System.out.println(q5Array[row]);
                }

                try {

                    // Print:
                    System.out.println("\n");
                    System.out.println("System.out.println(q5Array[]);");
                    System.out.println("\nEnter the missing index number for the above statement to return PYTHON:");

                    // Storing user input in variables as string.
                    String q5UsrnInpt = q4.nextLine();

                    // If user input is equal to 1
                    if (q5UsrnInpt.equals("1")) {

                        // increment by 1
                        marks++;
                    }

                    // Else, print:
                    else {
                        System.out.println(" ");
                    }
                }catch(Exception e){
                    System.out.println("You entered an unrecognised input!");
                }

                // Print:
                System.out.println("Question 6");

                // Print:
                System.out.println("The below output is from a for loop:");
                System.out.println("\n");

                // New variable containing string
                String q6String = "LOOP";

                // Here is a for loop, a new intiger has been declared and set to 0,
                // Then if i < than the length of the above variable,
                // iterate through all the characters, using the charAt function which returns the value at each index,
                // then print the variable to the screen in which thy are stored.
                for (int i = 0; i < q6String.length(); i++) {
                    char character = q6String.charAt(i);
                    System.out.println(character);
                }

                // New line
                System.out.println("\n");

                // Print:
                System.out.println("String q6String = \"LOOP\";");
                System.out.println(" for (int i = 0; i < q6String.length(); i++){\n" +
                        "                     character =  q6String.charAt(i);\n" +
                        "                    System.out.println(character);\n" +
                        "                }");

                // New Scanner for question 6
                Scanner q6 = new Scanner(System.in);

                try {

                    // Print:
                    System.out.println("\nAbove is the code for this loop to run, however there is a problem, enter the missing data type below:");

                    // Get user input
                    String q6UsrnInpt = q6.nextLine();

                    // If user input is equal to char
                    if (q6UsrnInpt.equals("char")) {

                        // Increment
                        marks++;
                    }

                    // Else, Print:
                    else {
                        System.out.println(" ");
                    }
                }catch(Exception e){
                    System.out.println("You entered an unrecognised input!");
                }

                // Print:
                System.out.println("Question 7");

                // Print:
                System.out.println("\nBelow is the code for a hash map and a for loop to print it out, After this section of code the output is displayed:");
                System.out.println("\n");

                System.out.println("HashMap<String, Integer> courcesAndStudents = new HashMap<String, Integer>();\n" +
                        "\n" +
                        "                courcesAndStudents.put(\"Artificial Intelligence\", 300);\n" +
                        "                courcesAndStudents.put(\"Cyber Security         \", 400);\n" +
                        "                courcesAndStudents.put(\"Computer Science       \", 430);\n" +
                        "                courcesAndStudents.put(\"Networking             \", 200);\n" +
                        "                courcesAndStudents.put(\"Help Desk Course\", 1);\n" +
                        "\n" +
                        "                for (String i : courcesAndStudents.keySet()){\n" +
                        "                    System.out.println(\"Course: \" + i + \"  Number of students: \" + courcesAndStudents.get(i));\n" +
                        "\n" +
                        "                }");

                System.out.println("\n");

                // Here I have created a HashMap, its keys are string and its values are integers,
                // then I have named it courcesAndStudents,
                // next I have added keys and values via the .put method.
                HashMap<String, Integer> courcesAndStudents = new HashMap<String, Integer>();

                courcesAndStudents.put("Artificial Intelligence", 300);
                courcesAndStudents.put("Cyber Security         ", 400);
                courcesAndStudents.put("Computer Science       ", 430);
                courcesAndStudents.put("Networking             ", 200);
                courcesAndStudents.put("Help Desk Course", 1);

                // Here is a for loop that uses the key-set method, this creates a set from hte HashMap,
                // then I am iterating through the set and applying string to both sets of values.
                for (String i : courcesAndStudents.keySet()) {
                    System.out.println("Course: " + i + "  Number of students: " + courcesAndStudents.get(i));

                }

                try {

                    // Print:
                    System.out.println("\nWe want to remove Help Desk Course and its students,");
                    System.out.println("\ncourcesAndStudents(\"Help Desk Course\", 1);");
                    System.out.println("\nenter the missing code from the above statement to remove this from the Hash Map:");

                    // New Scanner for question 7
                    Scanner q7 = new Scanner(System.in);

                    // Get user input
                    String q7UsrnInpt = q7.nextLine();

                    // If input equals .remove
                    if (q7UsrnInpt.equals(".remove")) {

                        // Increment
                        marks++;
                    }

                    // Else, Print:
                    else {
                        System.out.println(" ");
                    }

                }catch(Exception e){
                    System.out.println("You entered an unrecognised input!");
                }

                // Print:
                System.out.println("Question 8");

                System.out.println("\nint myInt = 5");

                System.out.println("\naDouble = Int;");

                System.out.println("\nAs you can see above we have an integer and below that we have an incomplete statement,\nenter what data type needs to be added to the start of the above statement to produce the out put 5.0:");

                // Question 8 scanner
                Scanner q8 = new Scanner(System.in);

                try {

                    // Storing user input in variables as string.
                    String q8UsrnInpt = q8.nextLine();

                    if (q8UsrnInpt.equals("double")) {
                        marks++;
                    }

                    // Else, Print:
                    else {
                        System.out.println(" ");
                    }

                }catch(Exception e){
                    System.out.println("You entered an unrecognised input!");
                }

                // Print:
                System.out.println("Question 9");

                // Question 8 scanner
                Scanner q9 = new Scanner(System.in);

                try {

                    // print:
                    System.out.println("\nIs HTML a programming language, 1 for yes 2 for no:");

                    // Storing user input in variables as string.
                    String q9UsrnInpt = q9.nextLine();

                    // If input is equal to 1
                    if (q9UsrnInpt.equals("2")) {

                        // add 1
                        marks++;
                    }

                    // Else, Print:
                    else {
                        System.out.println(" ");
                    }
                }catch(Exception e){
                    System.out.println("You entered an unrecognised input!");
                }

                // Print:
                System.out.println("Question 10");

                System.out.println("\nTrue or false, IPV6 addresses use base10:");

                // Creating new boolean in variable and setting it to false
                boolean q10TorF = false;

                // Question 8 scanner
                Scanner q10 = new Scanner(System.in);

                try {

                    // Storing user input in variables as string.
                    String q10UsrnInpt = q10.nextLine();

                    // If user input is equal to false, set boolean to true,
                    // if boolean is true + 1 to mark.
                    if (q10UsrnInpt.equals("false")) {
                        q10TorF = true;
                        if (q10TorF = true) {
                            marks++;
                        }
                    }

                    // Else, Print:
                    else {
                        System.out.println(" ");
                    }

                }catch(Exception e){
                    System.out.println("You entered an unrecognised input!");
                }

                // New variable with the long data type and the System.currentTimeMills method, this returns the current time.
                long testEndTime = System.currentTimeMillis();

                // Here I am taking the first variable with the method attached from the last, this will give us the time it took to compete the test in a new variable.
                long testTime = testEndTime - testStartTime;

                // Here we are storing both the mark variable and some strings values in a new variable,
                // This allows is to call the variable elsewhere.
                String endScore = ("You scored " + marks + " Out of 10");
                // Print variable
                System.out.println(endScore);

                // Print statement with the variable containing time taken for test.
                System.out.println("You took " + testTime / 1000 + " Seconds to finish this test");

                // Here I am changing the score to a string,
                // then I am setting the public variable to that string,
                // this allows me to display teh score as a string wherever i want in the programme.
                String changeToString = Integer.toString(marks);
                callTestScore = changeToString;

                // Here I have multiplied the score by 10 and stored it in a variables as an integer.
                int percentage = marks * 10;

                // If mark is more or equal to 7 and less than or equal to 10,
                // print message plus percentage variable plus another message.
                if (marks >= 7 && marks <= 10) {
                    System.out.println("Well done you have passed! " + percentage + "% Scored");
                    // Here we hava a try condition, this will try the following code.




                    try {
                        // Here I am using the fileWriter method to allow me to add the username and password to a txt file,
                        // I have stored this in a variable and added a new file name to be created.
                        // I have also added true to the end, this will append data not overwrite.
                        FileWriter writeTwoFile = new FileWriter("successfulApplication&Scores.txt", true);




                        // Here I am writing the name of the applicant,
                        // Here I am calling the variable from the loginSystem class to rerun the username of the user.
                        writeTwoFile.write("\n" + loginSystem.usernameName);

                        // Here I am writing the marks of the test to the file next to the name of the applicant
                        writeTwoFile.write(", " + marks);

                        // Once I have written to the file I close it.
                        writeTwoFile.close();
                        // Print:
                        System.out.println("Test Score delivered to Management ");

                        // Here we have a catch condition, this will find the error if user input is not expected,
                        // Then it will print a message and then below that will print the error code.
                    } catch (IOException e) {
                        System.out.println("Error");

                        // Print the error code
                        e.printStackTrace();
                    }



                }
                // Else, print message plus percentage variable plus another message.
                else {
                    System.out.println("You have failed, " + percentage + "% Scored");
                }

                // Break loop
                testChoice = 2;

            }

            // Else print:
            else{
                System.out.println("Input not recognised, Try Again: ");



            }

            // return to homepage
            applicantHomePage.home();
        }

    }

}
