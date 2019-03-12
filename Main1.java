package com.maktab25.hw4.torabi.practice1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Message");
        String message=scanner.nextLine();
        System.out.println("Enter a Code");
        int code=scanner.nextInt();
        MessageCoder messageCoder = new MessageCoder(message,code);
        System.out.println(messageCoder.encryptAll());
    }
}
