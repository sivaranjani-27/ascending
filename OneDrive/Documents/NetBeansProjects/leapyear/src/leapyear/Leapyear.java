package leapyear;

import java.util.Scanner;

public class Leapyear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        System.out.println("Enter year:");
        year = in.nextInt();
       if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

}
