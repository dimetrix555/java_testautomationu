package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        String[] days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        System.out.println("Enter the number of the day:");
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println(days[number - 1]);
        } catch (Exception e) {
            System.out.println("Error input");
        }
    }
}
