package Lesson1;

import java.util.Scanner;

public class T8_tankWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter volume[10..9999]: ");
        int tankVolume = sc.nextInt();
        int bucket1 = 2; //We have 2 buckets that can add water to the tank simultaneously and one by one
        int bucket2 = 3;
        int counter = tankVolume/5;
        int volumeModulus = tankVolume % 5;

        if (tankVolume < 10 || tankVolume > 9999) {
            System.out.println("Incorrect number!");
        }
        else {
            switch (volumeModulus) {
                case 0:
                    System.out.println(counter + " times x " + bucket1 + " litres, " +
                            counter + " times x " + bucket2 + " litres");
                    break;
                case 1:
                    counter=counter-1;
                    System.out.println(counter + " times x " + bucket1 + " litres, " +
                            counter + " times x " + bucket2 + " litres and additional 2 buckets of " + bucket2 + " litres");
                    break;
                case 2:
                    System.out.println(counter + " times x " + bucket1 + " litres, " +
                            counter + " times x " + bucket2 + " litres and additional 1 bucket of " + bucket1 + " litres");
                    break;
                case 3:
                    System.out.println(counter + " times x " + bucket1 + " litres, " +
                            counter + " times x " + bucket2 + " litres and additional 1 bucket of " + bucket2 + " litres");
                    break;
                case 4:
                    System.out.println(counter + " times x " + bucket1 + " litres, " +
                            counter + " times x " + bucket2 + " litres and additional 2 buckets of " + bucket1 + " litres");
                    break;
            }
        }
    }
}
