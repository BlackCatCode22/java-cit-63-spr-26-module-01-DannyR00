// URL: https://www.w3schools.com/java/java_math.asp
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // 1. Setup the ear to listen
        Scanner input = new Scanner(System.in);

        // 2. Ask for the radius
        System.out.print("Enter the radius of the circle: ");

        // 3. Use double (decimal) because radius isn't always a whole number
        double radius = input.nextDouble();

        // 4. Calculate the area (Area = PI * r * r)
        double area = Math.PI * radius * radius;

        // 5. Print the result
        System.out.println("The area of the circle is: " + area);

        input.close();
    }
}