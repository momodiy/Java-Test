package com.polymorphism;


/**
 * Created by stevenlee on 2018/1/23.
 */
class Dog extends com.polymorphism.Animal {
    public Dog() {

    }

    @Override
    public void eat() {
        System.out.println("子类的吃方法");
    }

    public void run(){
        System.out.println("I can run fast!");
    }
}
