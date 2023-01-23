package chapter8;

import java.util.Arrays;

public class DataTypes {
    public static void main(String[] args) {
        // Bohdan
        double[] arr = {1.5, 1.99, 2.3, 4.09, 5.62, 9.71};
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = (int) arr[i];
        }
        System.out.println(Arrays.toString(result));
        convertToInt(arr);
    }

    public static void convertToInt(double[] arr) {
        for(Double number: arr) {
            System.out.print(number.intValue() + " ");
        }
    }
}
