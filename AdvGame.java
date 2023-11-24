import java.util.Scanner;

public class AdvGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mysterious Cave Adventure!");
        System.out.println("You find yourself standing at the entrance of a dark and mysterious cave.");

        while (true) {
            System.out.println("\nWhat will you do?");
            System.out.println("1. Enter the cave.");
            System.out.println("2. Look around outside.");

            System.out.print("Enter your choice (1 or 2): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\nYou cautiously enter the cave...");

                    // Add more story and choices inside the cave
                    System.out.println("As you walk deeper into the cave, you encounter two tunnels.");
                    System.out.println("3. Take the left tunnel.");
                    System.out.println("4. Take the right tunnel.");

                    System.out.print("Enter your choice (3 or 4): ");
                    String tunnelChoice = scanner.nextLine();

                    switch (tunnelChoice) {
                        case "3":
                            System.out.println("\nYou venture into the left tunnel and find a treasure chest!");
                            System.out.println("Congratulations! You've won the game. Thanks for playing!");
                            System.exit(0);
                        case "4":
                            System.out.println("\nYou take the right tunnel and encounter a friendly creature.");
                            System.out.println("The creature leads you safely out of the cave.");
                            System.out.println("Congratulations! You've won the game. Thanks for playing!");
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice. Please enter a valid option.");
                    }
                    break;

                case "2":
                    System.out.println("\nYou decide not to enter the cave and look around outside.");
                    System.out.println("You find a hidden path that leads to a beautiful garden.");
                    System.out.println("Congratulations! You've discovered the secret garden. Thanks for playing!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
