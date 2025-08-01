package operations;

import java.util.Arrays;
import java.util.Scanner;

import sharedFiles.SharedMethods;

public class SimpleOperations {
    SharedMethods sharedMethods = new SharedMethods();
   
    public String[] availableOperations = {
            "Addition",
            "Substruction",
            "mutliplication",
            "Devision",
            "Exit"

    };
    String chosenOperation = "default";

    public SimpleOperations() {

    }

    public void executeChosenOperation(String op, Scanner sc) {
        System.out.println(" --- Chosen operation => " + op + " ---");
      int result=0;
      result = this.addition(sc);
        System.out.println(" ---  Result : " + result + " --");

    }

    public String[] getAvailableOperations() {
        return availableOperations;
    }

    public void setAvailableOperations(String[] availableOperations) {
        this.availableOperations = availableOperations;
    }



    private int addition(Scanner sc){ 
        System.out.println("How much numbers you want to add?");
        Boolean end = false;
        int nums =this.sharedMethods.intInputVerify(sc,true);
        int result = 0;
        int i = 0;
        while (!end && i < nums) {
            
            System.out.println("Enter the " + (i + 1) + this.sharedMethods.getOrdinal(i+1)+ " number's value");
            int number = this.sharedMethods.intInputVerify(sc,true);
            result += number;
            if (i < nums - 1) {
                System.out.println("Press any key to continue or 0 to end this operation then enter");
                int n = this.sharedMethods.intInputVerify(sc,true);
                if (n < 1)
                    end = true;
            }
            i++;
        }
return result;
    }



 
}
