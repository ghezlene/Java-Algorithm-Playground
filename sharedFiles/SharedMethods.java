package sharedFiles;

import java.util.Scanner;

public class SharedMethods {

    public SharedMethods() {

    }

    public int intInputVerify(Scanner sc, Boolean allowedRange) {
        while (!sc.hasNextInt() || !allowedRange) {
            System.out.println("Please enter a valid number between the allowed range");
            sc.next();
        }

        return sc.nextInt();
    }

    public String getOrdinal(int nb) {
        if (nb % 100 >= 11 && nb % 100 <= 13)
            return "th";

        switch (nb % 10) {
            case 1:
                return "st";

            case 2:
                return "nd";

            case 3:
                return "rd";

            default:
                return "th";

        }
    }
}
