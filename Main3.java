package com.maktab25.hw4.torabi.practice3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Price of a Photo Book");
        int price = Integer.parseInt(scanner.nextLine());
        Billing.setPhotoBookPrice(price);
        System.out.println("Enter name of Photo Book");
        String photoBook = scanner.nextLine();
        System.out.println("Enter number of the Photo Books");
        String quantityChecker = scanner.nextLine();
        int quantity=0;
        if (!quantityChecker.isEmpty())
            quantity = Integer.parseInt(quantityChecker);
        System.out.println("Enter Coupon Value:if you don't have any,press Enter");
        String couponChecker = scanner.nextLine();
        int couponValue=0;
        if (!couponChecker.isEmpty())
            couponValue = Integer.parseInt(couponChecker);
        if (quantityChecker.isEmpty())
            Billing.computeBill(photoBook);
        else if (couponChecker.isEmpty())
            Billing.computeBill(photoBook, quantity);

        else
            Billing.computeBill(photoBook, quantity, couponValue);
    }
}
