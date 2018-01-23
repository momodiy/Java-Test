package com.extend;

/**
 * CrRReated by stevenlee on 2018/1/22.
 */
public class Initial {

    public static void main(String[] args) {
        Animal animal=new Animal();
        System.out.println("animal age:"+animal.age);

        Dog dog=new Dog();
        dog.eat();
        dog.name="Roy";
        dog.age=91;
        dog.method();
        System.out.println(dog);
        System.out.println(dog.toString());

    }
}
