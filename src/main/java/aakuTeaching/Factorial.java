package aakuTeaching;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number you want the factorial of");
        Scanner sc = new Scanner(System.in);
        System.out.println("factorial is " + factorial(sc.nextInt()));
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }
}
/*
    10! = 10*9!
    n!=n*n-1!

    */
