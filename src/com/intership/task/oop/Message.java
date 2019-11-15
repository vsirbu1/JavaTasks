package com.intership.task.oop;

public interface Message {

    void prepareMessage();
    default void messageConverter(String name){
    }

}
