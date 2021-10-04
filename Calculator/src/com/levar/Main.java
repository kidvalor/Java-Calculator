package com.levar;
import java.util.Scanner;


public class Main {
    static void Add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of 1st number ::");
        int a = sc.nextInt();
        System.out.println("Enter value of 2nd number ::");
        int b = sc.nextInt();
        System.out.println(a + b);
    }


    static void Subtract() {
        System.out.println(a - b);
    }

    static void Multiply() {
        System.out.println(a * b);
    }

    static void Divide() {
        System.out.println(a / b);
    }


    public static void main(String args[]) {
        System.out.println("Add,Subtract, Mulitply, or Divide");
        Scanner sc = new Scanner(System.in);
        String calc = sc.next();



    }

}
