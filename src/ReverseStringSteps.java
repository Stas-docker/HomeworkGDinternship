import java.util.Scanner;

/**
 * An interactive console user interface for testing different string reversal methods.
 * This class handles user input and displays the results of the operations.
 */

public class ReverseStringSteps {

    /**
     * Starts the main interactive loop.
     * Prompts the user to enter a string, choose a reversal method, and displays the result.
     * The loop continues until the user explicitly chooses to exit.
     */

    public static void startGame() {
        try (final Scanner scanner = new Scanner(System.in)) {
            boolean isRunning = true;

            System.out.println("=== Welcome to the String Reverser ===");

            while (isRunning) {
                final String stringToReverse = askForString(scanner);
                showMenu();
                final int choice = chooseOptionToReverse(scanner);
                if (choice == 0) {
                    System.out.println();
                    System.out.println("Thank you for using the program. Goodbye!");
                    break;
                }
                executeReversal(stringToReverse, choice);
                isRunning = askToContinue(scanner);
            }
        }
    }

    /**
     * Prompts the user to enter a string.
     *
     * @param scanner the scanner used to read user input
     * @return the string entered by the user
     */

    private static String askForString(final Scanner scanner){
        System.out.println("Please enter the text you want to reverse: ");
        final String stringToReverse = scanner.nextLine();
        return stringToReverse;
    }

    /**
     * Displays the available string reversal methods to the console.
     */

    private static void showMenu(){
        System.out.println();
        System.out.println("--- AVAILABLE REVERSAL METHODS ---");
        System.out.println("1 - Reverse using StringBuffer");
        System.out.println("2 - Reverse using StringBuilder");
        System.out.println("3 - Reverse using While loop");
        System.out.println("4 - Reverse using standard For loop");
        System.out.println("5 - Reverse using For-Each loop");
        System.out.println("0 - Exit the program");
        System.out.println("----------------------------------");
    }

    /**
     * Prompts the user to choose a valid reversal method option.
     * Automatically handles invalid ranges by asking again.
     *
     * @param scanner the scanner used to read user input
     * @return a valid integer choice between 0 and 5
     */

    private static int chooseOptionToReverse(final Scanner scanner){
        System.out.println("Please enter the number of your choice (0-5): ");
        final int choice = getValidInputOfIntegerNumber(scanner);
        System.out.println();
        if (choice >= 0 && choice<= 5) {
            return choice;
        }
        else {
            System.out.println("Invalid input! Please enter a number between 0 and 5.");
        }
        return chooseOptionToReverse(scanner);
    }

    /**
     * Executes the chosen reversal method and prints the result.
     *
     * @param stringToReverse the original string to be reversed
     * @param choice the user's choice of reversal method
     */

    private static void executeReversal(final String stringToReverse, final int choice){
        System.out.println("--- RESULT ---");
        switch (choice) {
            case 1:
                System.out.println("StringBuffer: " + ReverseStringUtils.reverseWithBuffer(stringToReverse));
                break;
            case 2:
                System.out.println("StringBuilder: " + ReverseStringUtils.reverseWithBuilder(stringToReverse));
                break;
            case 3:
                System.out.println("While loop: " + ReverseStringUtils.reverseWithWhile(stringToReverse));
                break;
            case 4:
                System.out.println("ForI loop: " + ReverseStringUtils.reverseWithFori(stringToReverse));
                break;
            case 5:
                System.out.println("ForEach loop: " + ReverseStringUtils.reverseWithForEach(stringToReverse));
                break;
            default:
                System.out.println("Unexpected error: invalid choice.");
                break;
        }
        System.out.println("--------------");
        System.out.println();
    }

    /**
     * Asks the user whether they want to continue or exit the program.
     *
     * @param scanner the scanner used to read user input
     * @return {@code true} if the user wants to continue, {@code false} otherwise
     */

    private static boolean askToContinue(final Scanner scanner){
        boolean shouldContinue = false;
        boolean isInputValid = false;
        while (!isInputValid) {
            System.out.println("Would you like to reverse another string? Enter 1 (YES) or 2 (NO): ");
            final int wantToContinue = getValidInputOfIntegerNumber(scanner);
            System.out.println();
            if (wantToContinue == 1) {
                System.out.println("Let's go again!");
                shouldContinue = true;
                isInputValid = true;
            } else if (wantToContinue == 2) {
                System.out.println();
                System.out.println("Thank you for using the program. Goodbye!");
                shouldContinue = false;
                isInputValid = true;
            } else {
                System.out.println("Invalid input! Please enter exactly 1 or 2.");
                System.out.println();
            }
        }
        return shouldContinue;
    }

    /**
     * Reads an integer from the console, handling invalid non-integer inputs.
     *
     * @param scanner the scanner used to read user input
     * @return a valid integer entered by the user
     */

    private static int getValidInputOfIntegerNumber(final Scanner scanner){
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid number: ");
            scanner.nextLine();
        }
        final int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
}
