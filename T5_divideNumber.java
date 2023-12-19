package Lesson1;

import java.util.Scanner;

public class T5_divideNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Three digit number without 0 as digit to check if number is dividable to his digits
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int thirdDigit = n % 10;
        int secondDigit = (n / 10) % 10;
        int firstDigit = n / 100;

        if ((n < 111 || n > 999) || (firstDigit == 0 || secondDigit == 0 || thirdDigit == 0)) {
            System.out.println("Incorrect number!");
        }
        else if(n%thirdDigit==0 && n%secondDigit==0 && n%firstDigit==0){
            System.out.println("The number " + n + " is dividable to " + firstDigit + ", " + secondDigit + ", " + thirdDigit );
        }
        else System.out.println("The number is not dividable to his digits!");
    }
}
