package com.extend;

/**
 * Created by stevenlee on 2018/1/22.
 */
public class Animal {
    public int age = 10;
    public String name;
    final int id = 100;

    public void eat() {
        System.out.println("父类吃法");
    }

    public Animal() {
        System.out.println("Animal类开始执行");
        age = 16;
    }
    public Animal(int age){
        this.age=age;
    }

}
