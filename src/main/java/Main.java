import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("What year would you like to check?");

        // Gets input from user, saves input to year-variable
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        // If leap year check returns as true, print this
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        }

        // If leap year check returns as false, print this
        else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Function that receives a year in parameter and checks if it's a leap year
    public static boolean isLeapYear(int year){
        // If the year is divisible with 100 AND 400, the year is not a leap year
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }

        return (year % 4 == 0);
    }
}
