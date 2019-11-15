package com.intership.task.oop;

public class Main {
    public static void main(String[] args) {
        XmlMessage mes = new XmlMessage("test xml");
        mes.prepareMessage();
        mes.prepareMessage("Test1","Test2");
        MessageProcessor proc = new MessageProcessor();
        proc.convertMessage(mes.getBody(), "Json");
    }
}
