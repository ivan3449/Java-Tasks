package Lesson1;

import java.util.Scanner;

public class T6_isEven {
    public static void main(String[] args) {
        // Two numbers a,b[10..99]. Check if the last digit of a*b is even and print that digit
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A[10..99]: ");
        int a = sc.nextInt();
        System.out.println("Enter B[10..99]: ");
        int b = sc.nextInt();

        if((a<10 || a>99) && (b<10 || b>99)){
            System.out.println("Incorrect number!");
        }
        else if((a*b)%2==0){
            System.out.println(a*b + ", " + a*b%10 + " even");
        }
        else{
            System.out.println(a*b + ", " + a*b%10 + " odd");
        }
    }
}
