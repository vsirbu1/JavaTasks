package com.intership.task.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class CharList {
    private ArrayList<Character> container;

    CharList() {
        container = new ArrayList<>();
    }

    CharList(String inputText) {
        char[] chars = inputText.toCharArray();
        container = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            container.add(chars[i]);
        }
        //System.out.println(container);
    }

    public CharList(ArrayList<Character> list) {
        container = list;
        //System.out.println(container);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder(container.size());
        for(Character ch: container)
        {
            builder.append(ch);
        }
        return builder.toString();
    }

    public ArrayList<Character> getContainer() {
        return container;
    }

    public void setContainer(ArrayList<Character> container) {
        this.container = container;
    }

    int length() {
        return container.size();
    }

    char charAt(int index) {
        return container.get(index);
    }
    int indexOf(char c) {
        return container.indexOf(c);
    }
    String subString(int start, int stop){
        CharList list=new CharList(container);
        return list.toString().substring(start, stop);
    }
    CharList removeDublicates() {
        LinkedHashSet hashSet = new LinkedHashSet(container);
        ArrayList list1 = new ArrayList(hashSet);
        CharList list = new CharList(list1);
        return list;
    }
    CharList removeFirst(Character c){
        container.remove(c);
        CharList list=new CharList(container);
        return list;
    }
    CharList removeAll(Character c){
        container.removeAll(Collections.singleton(c));
        CharList list=new CharList(container);
        return list;
    }
    boolean isEmpty(){
        boolean b;
        String s=container.toString();
        //System.out.println("SSS "+s.isEmpty()+" "+s);
        if(s=="[]")
        {
            b= true;
        }
        else
            b= false;
        return b;
    }
    boolean contains(Character c){
        if(container.toString().contains(c.toString()))
        {
            return true;
        }
        else
            return false;
    }
    CharList clearList(){
        container.clear();
        CharList list=new CharList(container);
        return list;
    }
    CharList sortList(){
        Collections.sort(container);
        CharList list=new CharList(container);
        return list;
    }
    CharList reverseList(){
        Collections.reverse(container);
        CharList list=new CharList(container);
        return list;
    }

    CharList mixedList() {
        Collections.shuffle(container);
        CharList list=new CharList(container);
        return list;
    }

}

