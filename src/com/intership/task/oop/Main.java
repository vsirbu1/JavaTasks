package com.intership.task.oop;

public class Main {
    public static void main(String[] args) {
//        Define a class structure using the OOP principles for the following:
//        1. a MessageProcessor class that can 'process' different kinds of messages, outputting in console their contents
//        2. a structure for different Message classes (e.g. XmlMessage, JsonMessage, etc) that will implement a Message interface
//        3. they should all have a 'name' field with their actual name, and the 'body' field which will have message contents
//        4. they should all have a constructor method with a String parameter that will be assigned to 'body'
//        5. each Message should have different 'prepareMessage' methods implemented that will receive different parameter list (empty/String/String, String) that should output in console their parameter values (if any) and the actual message type ('name')
//        6. a MessageConverter that can 'convert' messages from one type to another ('body' should be the same)
        MessageProcessor proc = new MessageProcessor(); //Creating instance of class MessageProcessor
        XmlMessage mes = new XmlMessage("test xml"); //Creating instance of class XMLMessage
        mes.prepareMessage(); //Showing current message
        mes.prepareMessage("Test1","Test2"); //add to message additional text
        System.out.print("message processor says: ");
        proc.messageProcessor(mes);
        proc.convertMessage(mes.getBody(), "Json"); //Converting message to another format
    }
}
