import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Expense {
    private String description;
    private double amount;
    private String category;

    public Expense(String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Description: " + description + ", Amount: " + amount + ", Category: " + category;
    }
}

class ExpenseTracker {
    private ArrayList<Expense> expenses;
    private Map<String, Double> categorySum;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
        categorySum = new HashMap<>();
    }

    public void addExpense(String description, double amount, String category) {
        Expense expense = new Expense(description, amount, category);
        expenses.add(expense);

        // Update category sum
        categorySum.put(category, categorySum.getOrDefault(category, 0.0) + amount);

        System.out.println("Expense added successfully.");
    }

    public void displayExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses to display.");
        } else {
            System.out.println("Expense List:");
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    public void displayExpenseSummaries() {
        if (categorySum.isEmpty()) {
            System.out.println("No expense summaries to display.");
        } else {
            System.out.println("Expense Summaries:");
            for (Map.Entry<String, Double> entry : categorySum.entrySet()) {
                System.out.println("Category: " + entry.getKey() + ", Total Amount: " + entry.getValue());
            }
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseTracker expenseTracker = new ExpenseTracker();

        while (true) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Expense Summaries");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense description: ");
                    scanner.nextLine(); // Consume the newline character
                    String description = scanner.nextLine();
                    System.out.print("Enter expense amount: ");
                    double amount = scanner.nextDouble();
                    System.out.print("Enter expense category: ");
                    scanner.nextLine(); // Consume the newline character
                    String category = scanner.nextLine();
                    expenseTracker.addExpense(description, amount, category);
                    break;
                case 2:
                    expenseTracker.displayExpenses();
                    break;
                case 3:
                    expenseTracker.displayExpenseSummaries();
                    break;
                case 4:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
