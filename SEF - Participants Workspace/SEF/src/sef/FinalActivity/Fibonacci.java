package sef.FinalActivity;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        int n1 = 0;
        int n2 = 1;

        System.out.println("Input the length of the chain");
        Scanner keyboard = new Scanner(System.in);
        int len = keyboard.nextInt();
        int temp;

        while(len > 0) {
            System.out.println(n1);
            temp = n2;
            n2 = n2 + n1;
            n1 = temp;

            len--;
        }
    }
}
