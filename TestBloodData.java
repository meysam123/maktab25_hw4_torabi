package com.maktab25.hw4.torabi.practice4;

import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Blood Type");
        String bloodType = scanner.nextLine();
        System.out.println("Enter factor:+ or -");
        char factor = scanner.nextLine().charAt(0);
        BloodData bloodData = new BloodData(bloodType, factor);
        if (bloodData.getBloodType() != null && (bloodData.getFactor() == '+' || bloodData.getFactor() == '-'))

            System.out.println(bloodData.getBloodType() + bloodData.getFactor());

    }
}
