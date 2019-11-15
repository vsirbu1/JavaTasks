package com.intership.task.oop;

public class JsonMessage implements Message {

    private String name="JSON";

    private String body;


    public JsonMessage(String body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    public void prepareMessage() {
        System.out.println("Message type: "+name+ " || Message: "+body);
    }

    public void prepareMessage(String s) {
        body=body+" "+s;
        System.out.println("Message type: "+name+ " || Message: "+body);
    }

    public void prepareMessage(String s, String s1) {
        body=body+ " "+s+" "+s1;
        System.out.println("Message type: "+name+ " || Message: "+body);
    }

}
