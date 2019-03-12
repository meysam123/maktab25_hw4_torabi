package com.maktab25.hw4.torabi.practice3;

public class Billing {
    private static int photoBookPrice;

    public static void setPhotoBookPrice(int photoBookPrice) {
        com.maktab25.hw4.torabi.practice3.Billing.photoBookPrice = photoBookPrice;
    }

    public int getPhotoBookPrice() {
        return photoBookPrice;
    }

    static void computeBill(String photoBook) {
        System.out.println("price of "+photoBook+" is: " + photoBookPrice);
        System.out.println("total price:"+photoBookPrice * (1 + 0.08));


    }

    static void computeBill(String photoBook, int quantity) {
        System.out.println("price of "+photoBook+" is:" + photoBookPrice + "\n" + "quantity:" + quantity);
        System.out.println("total price:"+photoBookPrice * quantity * (1 + 0.08));
    }

    static void computeBill(String photoBook, int quantity, int couponValue) {
        System.out.println("price of "+photoBook+" is:" + photoBookPrice + "\n" + "quantity:" + quantity + "\n" + "coupon value:" + couponValue);
        System.out.println("total price:"+ (photoBookPrice * quantity-couponValue)*1.08);


    }
}
