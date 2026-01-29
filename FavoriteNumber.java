import java.util.Scanner; // Import the Scanner class

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favorite number: ");

        int favoriteNumber = scanner.nextInt();

        System.out.println("Your favorite number is " + favoriteNumber + "!");

        scanner.close();
    }
}
