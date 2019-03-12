package com.maktab25.hw4.torabi.practice1;
public class MessageCoder {
    private String message;
    private int code;
    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
    private char encrypt(int i) {
        char ch = ' ';
        if (message.charAt(i) != ' ')
            return (char) (((int) message.charAt(i)) + code);
        else
            return ch;

    }
}
