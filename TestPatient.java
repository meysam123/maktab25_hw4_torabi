package com.maktab25.hw4.torabi.practice4;

import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID");
        int id = scanner.nextInt();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        System.out.println("Enter Blood type and factor a space between them");
        String bloodType = scanner.next();
        char factor = scanner.next().charAt(0);
        Patient patient = new Patient(id, age, new BloodData(bloodType, factor));
        if (patient.getBloodData().getBloodType() != null && (patient.getBloodData().getFactor() == '+' || patient.getBloodData().getFactor() == '-')) {
            System.out.println("ID:"+id);
            System.out.println("Age:"+age);
            System.out.println(patient.getBloodData().getBloodType() + patient.getBloodData().getFactor());
        }
    }
}