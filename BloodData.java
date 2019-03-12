package com.maktab25.hw4.torabi.practice4;

public class BloodData {
    private String bloodType;
    private char factor;
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setFactor(char factor) {
        this.factor = factor;
    }

    public char getFactor() {
        return factor;
    }

    public String getBloodType() {
        return bloodType;
    }
    BloodData() {
        bloodType = "o";
        factor = '+';
    }
    BloodData(String bloodType, char factor) {
        if (bloodType.equalsIgnoreCase("AB") || bloodType.equalsIgnoreCase("A") || bloodType.equalsIgnoreCase("B") || bloodType.equalsIgnoreCase("O"))
            this.bloodType = bloodType;
        else
            System.out.println("This Blood Type is not valid");
        if (factor == '-' || factor == '+')
            this.factor = factor;
        else
            System.out.println("This factor is not valid");
    }

}
