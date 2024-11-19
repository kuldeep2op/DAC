package ostest;

import java.util.Scanner;

import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = sc.nextInt();

        if (x > 90) {
            System.out.println("Excellent");
        } else if (x > 60) { // Compare x with 60
            System.out.println("Good");
        } else {
            System.out.println("Average");
        }
    }
}
