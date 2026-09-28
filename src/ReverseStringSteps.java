import java.util.Scanner;

public class ReverseStringSteps {

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a string: ");
            final String stringToReverse = scanner.nextLine();


            System.out.println();
            System.out.println("1 - Reverse via StringBuffer");
            System.out.println("2 - Reverse via StringBuilder");
            System.out.println("3 - Reverse via While");
            System.out.println("4 - Reverse via ForI");
            System.out.println("5 - Reverse via ForEach");
            System.out.println("0 - Exit");
            System.out.println();
            System.out.println("Выберите пункт: ");


            if (!scanner.hasNextInt()) {
                System.out.println("Выберите число!");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Buffer: " + ReverseString.reverseWithBuffer(stringToReverse));
                    break;
                case 2:
                    System.out.println("Builder: " + ReverseString.reverseWithBuilder(stringToReverse));
                    break;
                case 3:
                    System.out.println("While: " + ReverseString.reverseWithWhile(stringToReverse));
                    break;
                case 4:
                    System.out.println("ForI: " + ReverseString.reverseWithFori(stringToReverse));
                    break;
                case 5:
                    System.out.println("ForEach: " + ReverseString.reverseWithForEach(stringToReverse));
                    break;
                case 0:
                    System.out.println();
                    System.out.println("Game over!");
                    break;
                default:
                    System.out.println("Error! There's no such option");
                    break;
            }
            System.out.println();


            System.out.println("Want to continue: 1(YES) 2(NO)");

            if (!scanner.hasNextInt()) {
                System.out.println("Выберите число!");
                scanner.nextLine();
                continue;
            }
            int wantToContinue = scanner.nextInt();
            scanner.nextLine();

            if (wantToContinue == 1) {
                System.out.println("Continue");
            } else if (wantToContinue == 2) {
                System.out.println();
                System.out.println("Game over!");
                break;
            }
            else {
                System.out.println("Error! There's no such option");
                break;
            }
        }
    }
}
