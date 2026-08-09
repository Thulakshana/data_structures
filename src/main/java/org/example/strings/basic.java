package org.example.strings;

public class basic {
    public static void main(String[] args) {
        String name="thulakshana";
        System.out.println(name.charAt(5));

        System.out.println(name.length());

        String name2=name.toUpperCase();
        System.out.println(name2);

        String text="hello wordl";
        System.out.println(text.contains("hello"));

        //get part of a string
        String result=text.substring(0,4);
        System.out.println(result);


    }
}
