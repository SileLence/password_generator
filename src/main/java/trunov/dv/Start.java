package trunov.dv;

import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<String> str = new PasswordString.Builder()
                .addUpperCase()
                .addLowerCase()
                .addDigits()
                .addSymbols()
                .build();
        System.out.println(str);
    }
}
