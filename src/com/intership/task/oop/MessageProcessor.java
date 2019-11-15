package com.intership.task.oop;

public class MessageProcessor {

    public void convertMessage(Object s, String s1) {
        switch (s1) {
            case ("XML"):
                //System.out.println("Message Type: " + s1 + " || Message: " + s.getBody());
                System.out.println("Message Type: " + s1 + " || Message: " + s);
                break;
            case ("Json"):
                System.out.println("Message Type: " + s1 + " || Message: " + s);
                break;
            default:
                System.out.println("Unknown message type");
                break;

        }
    }
}