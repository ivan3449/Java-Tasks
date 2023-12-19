package Lesson1;

import java.util.Scanner;

public class T7_isColdOrWarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temeperature: ");
        int temperature = sc.nextInt(); //Celsius, temperature [-100..100]

        if(temperature<-100 || temperature>100){
            System.out.println("Incorrect temperature");
        }
        else if(temperature<-20){
            System.out.println("Ice cold");
        }
        else if(temperature<0){
            System.out.println("Cold");
        }
        else if(temperature<15){
            System.out.println("Cool");
        }
        else if(temperature<25){
            System.out.println("Warm");
        }
        else{
            System.out.println("Hot");
        }
    }
}
