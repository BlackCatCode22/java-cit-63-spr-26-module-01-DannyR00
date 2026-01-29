import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reference: https://www.w3schools.com/java/java_strings_concat.asp

        System.out.print("Enter a noun: ");
        String noun = input.next();

        System.out.print("Enter a verb: ");
        String verb = input.next();

        System.out.print("Enter an adjective: ");
        String adj = input.next();

        System.out.println("The " + adj + " " + noun + " decided to " + verb + " in Fresno.");
    }
}