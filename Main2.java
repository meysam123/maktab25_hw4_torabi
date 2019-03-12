package com.maktab25.hw4.torabi.practice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Last Name");
        String lastName = scanner.nextLine();
        System.out.println("Enter your First Name");
        String firstName = scanner.nextLine();
        if (firstName.isEmpty())
            FormLetterWriter.displaySalutation(lastName);
        else
            FormLetterWriter.displaySalutation(firstName, lastName);
    }
}
