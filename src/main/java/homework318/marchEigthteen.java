package homework318;

import java.util.Scanner;

public class marchEigthteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your salary?");
        int input = scan.nextInt();
        System.out.println("how long have you worked here?");
        int input2 = scan.nextInt();

        if ((input > 79999) && (input2 < 2)) {
            System.out.println("yay...you qualify");
        } else {
            System.out.println("you have  " + (80000 - input) +  "  dollars left to qualify, and " + (3 -input2) + " years left to qualify");
        }

    }
}