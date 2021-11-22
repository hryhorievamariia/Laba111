package com.company;

public class Actor implements Comparable<Actor> {
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
        //return name;
    }

    @Override
    public int compareTo(Actor o) {
        String str1 = this.name;
        String str2 = o.name;
        return str1.compareTo(str2);
    }
    
}