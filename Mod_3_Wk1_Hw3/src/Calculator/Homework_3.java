package Calculator;

import java.util.Scanner;

public class Homework_3 {
    static void Add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter value of 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
    }


    static void Subtract() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter value of 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Difference: " + (a - b));
    }

    static void Multiply() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter value of 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Product: " + (a * b));
    }

    static void Divide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter value of 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Result: " + (a / b));
    }


    public static void main(String args[]) {
        System.out.println("Enter add, subtract, multiply, or divide");
        Scanner sc = new Scanner(System.in);
        String calc = sc.next();

        switch(calc) {
            case "Add" :
                Add();
                break;
            case "Subtract" :
                Subtract();
                break;
            case "Divide" :
                Divide();
                break;
            case "Multiply" :
                Multiply();
                break;
            default :
                System.out.println("Invalid Entry, Try Again");
        }



    }
}
