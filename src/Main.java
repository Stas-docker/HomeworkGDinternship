import java.util.Scanner;

public class Main {

         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             while (true){
             System.out.println("Введите строку: ");
             final String stringToReverse = scanner.nextLine();


             System.out.println();
             System.out.println("1 - Развернуть через StringBuffer");
             System.out.println("2 - Развернуть через StringBuilder");
             System.out.println("3 - Развернуть через While");
             System.out.println("4 - Развернуть через ForI");
             System.out.println("5 - Развернуть через ForEach");
             System.out.println("0 - Выйти из игры");
             System.out.println();
             System.out.println("Выберите пункт: ");


             if (!scanner.hasNextInt()){
                 System.out.println("Выберите от 0 до 5!");
                 scanner.nextLine();
                 continue;
             }

             int choice = scanner.nextInt();
             scanner.nextLine();
             System.out.println();

             if (choice == 1) {
                 System.out.println("Buffer: " + ReverseString.reverseWithBuffer(stringToReverse));
             }
             else if (choice == 2) {
                 System.out.println("Builder: " + ReverseString.reverseWithBuilder(stringToReverse));
             }
             else if (choice == 3) {
                 System.out.println("While: " + ReverseString.reverseWithWhile(stringToReverse));
             }
             else if (choice == 4) {
                 System.out.println("ForI: " + ReverseString.reverseWithFori(stringToReverse));
             }
             else if (choice == 5) {
                 System.out.println("ForEach: " + ReverseString.reverseWithForEach(stringToReverse));
             } else if (choice == 0) {
                 System.exit(0);
             } else {
                 System.out.println("Oшибка!");
             }
                 System.out.println();
           }
         }
      }
