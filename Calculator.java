  package MohanTec.org;

  import java.util.Scanner;

  public class Calculator {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          System.out.println("<++--***///Simple Calculator ++--***///>");
          System.out.println("Select many one operation:");
          System.out.println("1< Addition +");
          System.out.println("2< Subtraction -");
          System.out.println("3< Multiplication *");
          System.out.println("4< Division /");

          int choice = input.nextInt();

          System.out.print("Enter your First number : ");
          double num1 = input.nextDouble();

          System.out.print("Enter Second number value: ");
          double num2 = input.nextDouble();

          double result = 0;

          switch (choice) {
              case 1:
                  result = num1 + num2;
                  break;
              case 2:
                  result = num1 - num2;
                  break;
              case 3:
                  result = num1 * num2;
                  break;
              case 4:
                  if (num2 != 0) {
                      result = num1 / num2;
                  } else {
                      System.out.println("Error: Division by zero!");
                      System.exit(0);
                  }
                  break;
              default:
                  System.out.println("Invalid choice");
                  System.exit(0);
          }

          System.out.println("Result: " + result);
      }
  }