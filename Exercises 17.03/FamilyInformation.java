/*
Create a program that accepts input from a user.
The program must ask the user to enter info about his/her family.
The details that we need for each person are the following:
Name, Age, Height, Weight.
Store these details in a file in your Operating System.
The format of the file must be the following:
NAME        AGE        HEIGHT(m)    WEIGHT(kg)
Jack        12            1.85            65
Mary        24            1.76            76
The program should end only when the user enters "exit". But the process cannot be interrupted while entering details of a user. Everytime, the user inserts a person, the program should inform the user that "Person was successfully created".
Finally read the file that you created and print everything in the output
***Use formatted strings to create the format of the file(String.format)
***Create methods
 */
package familyinformation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 30694
 */
public class FamilyInformation {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String file = "C:\\Users\\30694\\Desktop\\Text2.txt";
        File file1 = new File(file);
        FileWriter file2 = new FileWriter(file1, true);
        PrintWriter printwriter = new PrintWriter(file2);
        printwriter.println("Name     Age     Height     Weight");
        for (int i = 0; i < 1; i--) {
            System.out.print("Would you like to add member of family?(Yes or No)");
            String likeAdd = input.next();
            if (likeAdd.equals("Yes")){
            System.out.print("Insert name:");
            String name = input.next();
            System.out.print("Insert age:");
            int age = input.nextInt();
            System.out.print("Insert height in meters:");
            double height = input.nextDouble();
            System.out.print("Insert weight in Kg:");
            int weight = input.nextInt();
            printwriter.println(name + "     " + age + "     " + height + "     " + weight + "     ");
            System.out.println("Person was successfully created");
            
            
            }else if (likeAdd.equals("No")){
                break;
            }
        }
        printwriter.close();
file2.close();
    }

}
