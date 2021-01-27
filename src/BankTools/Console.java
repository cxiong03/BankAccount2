package BankTools;

import java.util.Scanner;

public class Console implements Ui {

    Scanner scanner = new Scanner(System.in);

    @Override
    public int getNumber(String query, int min, int max) {
        System.out.println(query);
        int inputInt;
        do {
            String input = scanner.nextLine();
            // TODO: try catch block to protect against non number strings.
            inputInt = Integer.parseInt(input);
        } while (inputInt < min || inputInt > max);

        return inputInt;
    }

    @Override
    public String getString(String query) {
        System.out.println(query);
        return scanner.nextLine();
    }
}
