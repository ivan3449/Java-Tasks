package Lesson1;

import java.util.Scanner;

public class T3_ascendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();

        if(a<b){
            System.out.println(a + ", " + b);
        }
        else{
            System.out.println(b + ", " + a);
        }
    }
}
