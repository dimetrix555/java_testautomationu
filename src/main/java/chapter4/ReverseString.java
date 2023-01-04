package chapter4;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Hello World!"));
        System.out.println(reverse2("Hello World!"));
    }

    public static String reverse(String input) {
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            char tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        StringBuilder builder = new StringBuilder();
        for (char a : array) {
            builder.append(a);
        }
        return builder.toString();
    }

    public static String reverse2(String input) {
        String reversedStr = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + input.charAt(i);
        }
        return reversedStr;
    }
}
