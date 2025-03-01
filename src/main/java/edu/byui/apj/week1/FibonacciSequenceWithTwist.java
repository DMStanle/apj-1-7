package edu.byui.apj.week1;

public class FibonacciSequenceWithTwist {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: Please provide a positive integer. ");
            return;
        }
        int n;
        try {
            n = Integer.parseInt(args[0]);
            if (n <= 0) {
                System.out.println("Error: Please provide a positive integer. ");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
            return;
        }


        System.out.print("The first ");
        System.out.print(n);
        System.out.print(" numbers in the Fibonacci sequence are: ");

        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(first);


            if (first % 2 == 0) {
                System.out.print("*");
            }
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();



    }
}