package com.intership.task.oop;

public class XmlMessage implements Message {
    private String name = "XML";

    private String body;

    public XmlMessage(String body) {
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

