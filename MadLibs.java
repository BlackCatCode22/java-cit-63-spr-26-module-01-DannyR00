// Reference: https://www.w3schools.com/java/java_strings_concat.asp

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Gather inputs
        System.out.print("Enter an adjective: ");
        String adj = input.nextLine();

        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb (past tense): ");
        String verb = input.nextLine();

        System.out.print("Enter a place: ");
        String place = input.nextLine();

        // 2. Build the story using concatenation (+)
        System.out.println("\n--- Your Mad Lib Story ---");
        String story = "On a very " + adj + " day, a " + noun + " " + 
                       verb + " all the way to " + place + ".";
        
        System.out.println(story);

        input.close();
    }
}
