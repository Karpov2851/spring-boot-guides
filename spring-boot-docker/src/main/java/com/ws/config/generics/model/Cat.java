package com.ws.config.generics.model;

/**
 * Created by vikas on 13-06-2019.
 */
public class Cat extends Animal implements Comparable{

    public void walk(){
        System.out.println("can walk");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
