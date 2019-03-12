package com.maktab25.hw4.torabi.practice3;

public class Billing {
    private static int photoBookPrice = 150;

    public static void setPhotoBookPrice(int photoBookPrice) {
        Billing.photoBookPrice = photoBookPrice;
    }

    public int getPhotoBookPrice() {
        return photoBookPrice;
    }
}
