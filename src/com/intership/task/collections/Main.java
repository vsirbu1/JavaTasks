package com.intership.task.collections;

public class Main {

    public static void main(String[] args) {
        CharList list = new CharList("abc123123");
        System.out.println(list);
        String b = list.toString();
        CharList list2 = new CharList("abc123123");
        System.out.println(list.toString());
        System.out.println(list.indexOf('1'));
        System.out.println(list.length());
        System.out.println(list.charAt(1));
        System.out.println(list.subString(3, 5));
        System.out.println(list.removeDublicates());
        System.out.println("2" + list.removeAll('1').removeAll('2'));
        System.out.println(list2.removeFirst('1'));
        System.out.println(list.getContainer());
        System.out.println(list.contains('q'));
        System.out.println(list.contains('a'));
        list = list.clearList();
        System.out.println(list.getContainer());
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list2.isEmpty());
        list2 = list2.sortList();
        System.out.println(list2);
        list2 = list2.reverseList();
        System.out.println(list2);
        list2 = list2.mixedList();
        System.out.println(list2);
    }
}