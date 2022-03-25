package com.mentorship;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Scanner input = new Scanner(System.in);

        System.out.print("Please, input the 1st number: ");
        calc.a = input.nextFloat();

        System.out.print("Please, input the operation + - * / : ");
        calc.operation = input.next().charAt(0);

        System.out.print("Please, input the 2nd number: ");
        calc.b = input.nextFloat();

        switch (calc.operation) {
            case '+':
                System.out.println(calc.a + " + " + calc.b + " = " + calc.add());
                break;
            case '-':
                System.out.println(calc.a + " - " + calc.b + " = " + calc.sub());
                break;
            case '*':
                System.out.println(calc.a + " * " + calc.b + " = " + calc.mul());
                break;
            case '/':
                System.out.println(calc.a + " / " + calc.b + " = " + calc.div());
                break;
            default:
                System.out.println("Wrong operation!");
        }
    }
}
