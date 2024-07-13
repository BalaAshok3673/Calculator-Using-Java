import java.util.Scanner;

public class Calculator{

    private Scanner sc;

    public Calculator(){
        sc = new Scanner(System.in);
    }

    private void displayMenu() {
        System.out.println("\nCalculator Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private void calculate(Operation operation) {
        int a = getIntInput("Enter first number:");
        int b = getIntInput("Enter second number:");

        switch (operation) {
            case ADD:
                System.out.println("Result: " + (a + b));
                break;
            case SUBTRACT:
                System.out.println("Result: " + (a - b));
                break;
            case MULTIPLY:
                System.out.println("Result: " + (a * b));
                break;
            case DIVIDE:
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero");
                } else {
                    System.out.println("Result: " + ((double) a / b));
                }
                break;
        }
    }

    private int getIntInput(String message) {
        System.out.print(message + " ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    public void start() {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            String choice = scanner.nextLine().trim().toLowerCase();

            switch (choice) {
                case "1":
                    calculate(Operation.ADD);
                    break;
                case "2":
                    calculate(Operation.SUBTRACT);
                    break;
                case "3":
                    calculate(Operation.MULTIPLY);
                    break;
                case "4":
                    calculate(Operation.DIVIDE);
                    break;
                case "5":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
        System.out.println("Calculator closed.");
        scanner.close();
    }
}
    

