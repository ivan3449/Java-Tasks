package Lesson1;

import java.util.Scanner;

public class T4_descendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Three numbers in descending order
        int temp;
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        System.out.println("Enter C: ");
        int c = sc.nextInt();

        if(a<b){
            temp = a;
            a = b;
            b = temp;
        }
        if(b<c){
            temp = b;
            b = c;
            c = temp;
        }
        if(a<b){
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println("From biggest to smallest: " + a + ", " + b + ", " + c);
    }
}
