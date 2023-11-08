import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class LinkShortener {
    private HashMap<String, String> shortToLongMap = new HashMap<>();
    private HashMap<String, String> longToShortMap = new HashMap();

    public String shortenLink(String longURL) {
        String shortCode = generateShortCode();
        shortToLongMap.put(shortCode, longURL);
        longToShortMap.put(longURL, shortCode);
        return shortCode;
    }

    public String expandLink(String shortURL) {
        if (shortToLongMap.containsKey(shortURL)) {
            return shortToLongMap.get(shortURL);
        } else {
            return "Short URL not found!";
        }
    }

    private String generateShortCode() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder shortCode = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            shortCode.append(characters.charAt(random.nextInt(characters.length()));
        }

        return shortCode.toString();
    }

    public static void main(String[] args) {
        LinkShortener linkShortener = new LinkShortener();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Shorten a URL");
            System.out.println("2. Expand a Short URL");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a long URL: ");
                    String longURL = scanner.next();
                    String shortURL = linkShortener.shortenLink(longURL);
                    System.out.println("Shortened URL: " + shortURL);
                    break;
                case 2:
                    System.out.print("Enter a short URL: ");
                    String shortURLToExpand = scanner.next();
                    String expandedURL = linkShortener.expandLink(shortURLToExpand);
                    System.out.println("Expanded URL: " + expandedURL);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
