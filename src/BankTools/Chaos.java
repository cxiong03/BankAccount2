package BankTools;

import java.util.Random;
import java.util.Scanner;

public class Chaos implements Ui {

    Random rand = new Random();

    @Override
    public int getNumber(String query, int min, int max) {
        // min 5 max 10
        return rand.nextInt(max - min + 1) + min;
    }

    @Override
    public String getString(String query) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(query);
        return scanner.nextLine();
    }
}
