package Lesson1;

import java.util.Scanner;

public class T2_swapValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();

        System.out.println("A is: " + a + " and B is: " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("A now is: " + a + " and B now is: " + b);
    }
}
