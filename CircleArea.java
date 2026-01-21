// References:
// https://www.w3schools.com/java/java_math.asp
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Get the radius from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // 2. Calculate area: Area = PI * radius^2
        // We use Math.PI for the constant and Math.pow for the exponent
        double area = Math.PI * Math.pow(radius, 2);

        // 3. Display the result
        System.out.println("The area of a circle with radius " + radius + " is " + area);

        input.close();
    }
}
