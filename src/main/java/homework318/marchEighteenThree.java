package homework318;

import java.util.Scanner;

public class marchEighteenThree {
    public static void main(String[] args) {
        Scanner checks = new Scanner(System.in);
        System.out.println("what is your hourly pay?");
        double hourPay = checks.nextDouble();
        System.out.println("how many hours have you worked?");
        double hoursWorked = checks.nextDouble();
        if (hoursWorked < 40) {
            System.out.println((1.5 * hourPay) + hoursWorked);
        } else if (hoursWorked >= 40) ;
        System.out.println(hoursWorked * hourPay);


    }

    }
