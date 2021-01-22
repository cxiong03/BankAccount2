package BankTools;

import java.util.Scanner;

public class Console implements Ui {

    Scanner scanner = new Scanner(System.in);

    @Override
    public int getNumber(String query) {
        return 0;
    }

    @Override
    public String getString(String query) {
        return null;
    }
}
