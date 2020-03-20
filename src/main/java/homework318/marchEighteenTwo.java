package homework318;

import java.util.Scanner;

public class marchEighteenTwo {
    public static void main(String[] args) {
        Scanner coin = new Scanner(System.in);
        System.out.println("how many pennies would you like?");
        double pennies = coin.nextDouble();
        System.out.println("how many nickels would you like?");
        double nickels = coin.nextDouble();
        System.out.println("How many dimes would you like?");
        double dimes = coin.nextDouble();
        System.out.println("How many quarters");
        double quarters = coin.nextDouble();
        double total = ((pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25));
        if (total == 1.00) {
            System.out.println("you have won");
        } else if(total > 1.00) {
            System.out.println((1.00 - total) + " over the expected amount.");
        } else if(total < 1.00) {
            System.out.println((total - 1.00) + " under the expected amount.");


        }




    }
}
