import java.util.Scanner;

import operations.SimpleOperations;

public class mainClass {
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          Boolean exit = false;
          int choiceNumber = -1;
          // add other operations categories if needed before the 'Exit'
          final String[] operationsCategories = {
                    "Simple operations",
                    "Array Operations",
                    "String Operations",
                    "Problem Solving",
                    "Exit"
          };

          System.out.println("---- Welcome ---");
          System.out.println("Please choose a category to follow");
          for (int i = 1; i <= operationsCategories.length; i++) {
               System.out.println(i + ": " + operationsCategories[i - 1]);
          }
          System.out.print("Enter Choice: ");

          String choice = operationsCategories[operationsCategories.length - 1];
          while (!(choiceNumber > 0 && choiceNumber <= operationsCategories.length)) {

               choiceNumber = sc.nextInt();
               if (!(choiceNumber > 0 && choiceNumber <= operationsCategories.length)) {
                    System.out.println("Please enter a valid choice!");
               } else {
                    choice = operationsCategories[choiceNumber - 1];
               }

          }

          while (!exit) {
               switch (choice) {
                    case "Simple operations":
                         simpleOperations(sc);
                         break;
                    case "Array Operations":
                         break;
                    case "String Operations":
                         break;
                    case "Problem Solving":
                         break;
                    default:
                         break;
               }

               exit = true;
          }

          sc.close();

     }

     private static void simpleOperations(Scanner sc) {

          SimpleOperations opsClass = new SimpleOperations();
          String[] availableOperations = opsClass.getAvailableOperations();
          System.out.println("Please choose an operation to execute");
          for (int i = 1; i <= availableOperations.length; i++) {
               System.out.println(i + ": " + availableOperations[i - 1]);
          }

          int choiceNB = -1;
          String choice = availableOperations[availableOperations.length - 1];
          while (!(choiceNB > 0 && choiceNB <= availableOperations.length)) {

               choiceNB = sc.nextInt();
               if (!(choiceNB > 0 && choiceNB <= availableOperations.length)) {
                    System.out.println("Please enter a valid choice!");
               } else {
                    choice = availableOperations[choiceNB-1];
               }

          }


          opsClass.executeChosenOperation(choice);
     }
}
