package Lesson1;

import java.util.Scanner;

public class T9_ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number[100-999]");
        int n = sc.nextInt();
        int n3 = n % 10;
        int n2 = (n / 10) % 10;
        int n1 = n / 100;

        if (n1 == n2 && n2 == n3) {
            System.out.println("The digits are equal");
        }
        else if (n1 < n2 && n2 < n3) {
            System.out.println("For number " + n + " the digits are in ascending order");
        }
        else if (n1 > n2 && n2 > n3) {
            System.out.println("For number " + n + " the digits are in descending order");
        }
        else {
            System.out.println("Different case");
        }
    }
}
