package org.example;

import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello there! How are you doing today? ");
        String response1 = scanner.nextLine();

        System.out.print("Wow - Interesting! Tell me more! ");
        String response2 = scanner.nextLine();

        System.out.println("Goodbye!");
        scanner.close();
    }
}

