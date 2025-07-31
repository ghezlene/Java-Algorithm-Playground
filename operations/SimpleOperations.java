package operations;

import java.util.Arrays;

public class SimpleOperations {
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

    public void executeChosenOperation(String op) {
        System.out.println("Chosen operation => " + op);
    }

    public String[] getAvailableOperations() {
        return availableOperations;
    }

    public void setAvailableOperations(String[] availableOperations) {
        this.availableOperations = availableOperations;
    }

}
