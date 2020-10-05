package com.ws.config.generics;

import com.ws.config.generics.innerclasses.Employee;
import com.ws.config.generics.model.Cat;

import java.io.File;
import java.util.*;

/**
 * Created by vikas on 13-06-2019.
 */
public class MainGenerics{

    @SuppressWarnings(value = "unchecked")
    public static void main(String[] args) {
        Serailization st = new Serailization("Vikas","Menon");
        File f = new File("D:/test.txt");

        System.out.println("Hello Geeks");


    }

}
