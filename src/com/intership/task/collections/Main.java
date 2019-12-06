package com.intership.task.collections;

public class Main {

    public static void main(String[] args) {
//        Implement:
//        CharList()
//        CharList(String s)
//        private CharList(ArrayList<Character> list) - it will help you to implement other methods.
//        Methods:
//        String toString()
//        int length() - returns CharList length.
//        char charAt(int index) - returns char value for the particular index
//        int indexOf(char c) - returns the specified char value index
//        CharList subString(int start, int end) - returns substring for given begin index.
//        CharList removeDuplicates() - remove duplicates symbols using collections.
//        CharList replaceFirst(Character c) - remove first occurrences of the specified char value.
//        CharList removeAll(Character c) - remove all occurrences of the specified char value.
//        boolean isEmpty() - returns true is CharList is empty.
//        boolean contains(Character c) - returns true is CharList contains the specified char value.
//        CharList clearList() - returns cleared CharList.
//        CharList sortList() - returns sorted CharList.
//        CharList reverseList() - returns reversed CharList.
//        CharList mixedList() - returns CharList with mixed elements.
//
//        Additional(optional) methods(you can implement them however you want):
//        boolean trim - removes beginning and ending spaces of this charlist.
//        CharList concat - concatenates the specified CharList.
//        CharList replaceAll(CharList old, CharList new) - replaces all occurrences of the specified CharList value.
//        CharList replaceFirst(CharList old, CharList new) - replaces all occurrences of the specified CharList value.
//        CharList replaceLast(CharList old, CharList new) - replaces all occurrences of the specified CharList value.
//        boolean endsWith(CharList charList) - returns true if CharList ends with given charList
//        CharList toLowerCase - returns a CharList in lowercase.
//        CharList toUpperCase - returns a CharList in uppercase.
//        boolean isPalindrome - A palindrome String is a String that is same after reverse. Returns true if CharList is palindrome.
//
//        Test data:
//        CharList is: acb123123
//        Index of '1' char is: 3
//        Length of CharList is: 9
//        Char on the second place is: b
//        Substring(from 3 to 5) of CharList is: 12
//        CharList without duplicate symbols is: a1b2c3
//        CharList without removed symbols('1', '2') is: acb33
//        CharList without removed first symbol('1') is: acb23123
//        CharList contains symbol 'q': false
//        CharList contains symbol 'a': true
//        Cleared CharList:
//        CharList is empty: true
//        Sorted CharList: 112233abc
//        Reversed CharList: 321321bca
//        Mixed CharList: 1a322b13c
        CharList list = new CharList("abc123123");
        System.out.println("CharList is: "+list);
        String b = list.toString();
        CharList list2 = new CharList("abc123123");
        System.out.println("Index of '1' char is: "+list.indexOf('1'));
        System.out.println("Length of CharList is: "+list.length());
        System.out.println("Char on the second place is: "+list.charAt(1));
        System.out.println("Substring(from 3 to 5) of CharList is: "+list.subString(3, 5));
        System.out.println("CharList without duplicate symbols is: "+list.removeDublicates());
        System.out.println("CharList without removed symbols('1', '2') is: " + list.removeAll('1').removeAll('2'));
        System.out.println("CharList without removed first symbol('1') is: "+list2.removeFirst('1'));
        System.out.println("CharList is: "+list.getContainer());
        System.out.println("CharList contains symbol 'q': " +list.contains('q'));
        System.out.println("CharList contains symbol 'a': " +list.contains('a'));
        list = list.clearList();
        System.out.println("CharList is: "+list.getContainer());
//        System.out.println(list);
        System.out.println("CharList is empty: "+list.isEmpty());
        System.out.println("CharList2 is empty: "+list2.isEmpty());
        list2 = list2.reverseList();
        System.out.println("Reversed CharList: "+list2);
        list2 = list2.sortList();
        System.out.println("Sorted CharList: "+list2);
        list2 = list2.reverseList();
        System.out.println("Reversed CharList: "+list2);
        list2 = list2.mixedList();
        System.out.println("Mixed CharList: "+list2);
        System.out.println("Charlist is palindrome: "+ list2.isPalindrome());
        CharList list3 = new CharList("abcddcba");
        System.out.println("Charlist is palindrome: "+ list3.isPalindrome());
        System.out.println("Charlist to UpperCase: "+ list3.toUpper());
        System.out.println("Charlist to LowerCase: "+ list3.toLower());
    }
}