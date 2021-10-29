package trunov.dv;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PasswordString {
    private String result;

    static class Builder {
        private final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
        private final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        private final String SYMBOLS = "!?@-#$_%^&";
        private final String DIGITS = "0123456789";
        private String result = "";

        Builder addLowerCase() {
            result += LOWER_CASE;
            return this;
        }

        Builder addUpperCase() {
            result += UPPER_CASE;
            return this;
        }

        Builder addSymbols() {
            result += SYMBOLS;
            return this;
        }

        Builder addDigits() {
            result += DIGITS;
            return this;
        }

        List<String> build() {
            PasswordString passStr = new PasswordString();
            passStr.result = result;
            return passStr.get();
        }
    }

    private List<String> get() {
        return multiplyAndShuffle(result);
    }

    private List<String> multiplyAndShuffle(String str) {
        String multiplied = StringUtils.repeat(str, 4);
        List<String> symbolsList = Arrays.asList(multiplied.split(""));
        Collections.shuffle(symbolsList);
        return symbolsList;
    }
}
