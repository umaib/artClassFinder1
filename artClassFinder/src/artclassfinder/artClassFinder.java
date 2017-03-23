/*
/*
 *Program: Add Attendance Taker
 Purpose: To detect nearby arts classes based on the user's interest and to take the attendance for the class itself.
 Date: 23/03/17
 */
package artClassFinder;

/**
 *
 * @author 322944927
 */
import java.io.*;
import java.util.*;

public class artClassFinder{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Set up a scanner to take the user's input.
        Scanner inReader = new Scanner(System.in);
        //Greet user
        System.out.println("Hello user! What are you interested in? ");
        //Create a list of options.
        System.out.println(" 1. Visual Arts");
        System.out.println(" 2. Performing Arts");
        System.out.println(" 3. Martial Arts");
        System.out.println(" 4. Arts through Technology");
        System.out.println(" ");
        System.out.println("Enter your selection here: ");
        //Store their option
        int userChoice = inReader.nextInt();
        //
        
        
        
        
        
        
        //Create a switch statement with cases and an if statement to specifiy the art.
        switch (userChoice) {
            case 1:
                //If statement for two types of art
                System.out.println(" ");
                System.out.println("You chose Visual Arts! Here are two types of visual arts offered near you:");
                System.out.println("A. Photography");
                System.out.println("B. Sculpting");
                System.out.println(" ");
                //Ask user to type input
                System.out.println("Type your choice here: ");
                //Store choice
                String chA = inReader.nextLine();
                //Ifs 
                if (chA.equalsIgnoreCase("Photography") || chA.equalsIgnoreCase("A")) {
                    System.out.println("We will now find a photography class near you...");
                    //Store this info
                    String artA = inReader.nextLine();
                } else if (chA.equalsIgnoreCase("Sculpting") || chA.equalsIgnoreCase("B")) {
                    System.out.println("We will now find a sculpting class near you...");
                    String artA = inReader.nextLine();
                }
                break;
            case 2: 
                System.out.println("hello");

        }
    }

}

