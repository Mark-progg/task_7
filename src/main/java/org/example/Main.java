package org.example;

public class Main {
    public static void main(String[] args) {
        myArrayList<String> strings = new myArrayList<>();
        strings.add("test1");
        strings.add("test2");
        strings.add("test3");


        for (String s : strings){
            System.out.println(s);
        }

        System.out.println(strings.get(0));
        System.out.println(strings.size());
        strings.remove("test1");
        System.out.println(strings.get(0));
        System.out.println(strings.size());
        System.out.println(strings.contains("test1"));
        strings.clear();
        System.out.println(strings.isEmpty());
    }
}