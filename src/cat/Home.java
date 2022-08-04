package cat;

import java.util.Objects;

public class Home {

    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("ƒес€тичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Ўестнадцатеричное число " + hexNumber + " равно дес€тичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
        int hex = 0;
        String hex1 = "";
        while (decimalNumber != 0) {
            hex = decimalNumber % 16;
            if (hex == 10) {
                char char10 = HEX.charAt(10);
                hex1 = char10 + hex1;
            } else if (hex == 11) {
                char char11 = HEX.charAt(11);
                hex1 = char11 + hex1;
            } else if (hex == 12) {
                char char12 = HEX.charAt(12);
                hex1 = char12 + hex1;
            } else if (hex == 13) {
                char char13 = HEX.charAt(13);
                hex1 = char13 + hex1;
            } else if (hex == 14) {
                char char14 = HEX.charAt(14);
                hex1 = char14 + hex1;
            } else if (hex == 15) {
                char char15 = HEX.charAt(15);
                hex1 = char15 + hex1;
            } else {
                hex1 = (decimalNumber % 16) + hex1;
            }
            decimalNumber = decimalNumber / 16;
        }
        return hex1;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == "" || hexNumber == null) {
            return 0;
        }
        int decimalNumber = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            char char16 = hexNumber.charAt(i);
            int a = 0;
            if (char16 == 'a') {
                a = 10;
            } else if (char16 == 'b') {
                a = 11;
            } else if (char16 == 'c') {
                a = 12;
            } else if (char16 == 'd') {
                a = 13;
            } else if (char16 == 'e') {
                a = 14;
            } else if (char16 == 'f') {
                a = 15;
            } else {
                a = char16;
            }
            decimalNumber = 16 * decimalNumber + a;
        }
        return decimalNumber;
    }

}