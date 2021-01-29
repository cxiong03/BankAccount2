package BankTools;

import java.util.Random;

public class Generator {
    //By making our methods static we don't need to instantiate Generator

    static public String randomCode(String characters, int length) {
        Random rand = new Random();
        String[] chars = characters.split("");
        String output = "";
        for (int count = 0; count < length; count++) {
            output += chars[rand.nextInt(chars.length)];
        }
        return output;
    }
}
