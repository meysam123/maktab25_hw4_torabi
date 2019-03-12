package com.maktab25.hw4.torabi.practice4;

public class TestBloodData {
    public static void main(String[] args) {
        BloodData bloodData = new BloodData("aB", '-');
        if (bloodData.getBloodType().equalsIgnoreCase("AB") || bloodData.getBloodType().equalsIgnoreCase("A") || bloodData.getBloodType().equalsIgnoreCase("B") || bloodData.getBloodType().equalsIgnoreCase("O"))
            if (bloodData.getFactor() == '-' || bloodData.getFactor() == '+')
                System.out.println(bloodData.getBloodType() + bloodData.getFactor());
            else
                System.out.println("This factor is not valid");
        else
            System.out.println("This Blood Type is not valid");
    }
}
