package com.ws.config.generics.innerclasses;


/**
 * Created by vikas on 13-06-2019.
 */
public class Employee implements Comparable<Employee>{
    public int age;
    public String name;

    public Employee() {
    }

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.age >  o.age){
            return 1;
        } else if(this.age == o.age){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
