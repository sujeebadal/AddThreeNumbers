package com.company;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        System.out.println("Enter a number: ");
        System.out.println("Enter a number: ");
        int num1= Keyboard.nextInt();
        int num2= Keyboard.nextInt();
        int num3= Keyboard.nextInt();
        int sum= num1+num2+num3;
        System.out.println(sum);
    }

}
