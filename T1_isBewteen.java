package Lesson1;

import java.util.Scanner;

public class T1_isBewteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        System.out.println("Enter C:");
        int c = sc.nextInt();

        if ((c >= a && c <= b) || (c <= a && c >= b)) {
            System.out.println(c + " is between " + a + " and " + b);
        } else {
            System.out.println(c + " is not between " + a + " and " + b);
        }
    }
}