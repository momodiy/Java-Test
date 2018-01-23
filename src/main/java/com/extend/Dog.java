package com.extend;

/**
 * Created by stevenlee on 2018/1/22.
 */
public class Dog extends Animal {

    @Override
    public void eat(){
        System.out.println("子类吃法！");
    }
    int age=30;

    public void method(){
        //super(); 自动隐式调用
        System.out.println("super关键字访问到的父类age属性：");
        System.out.println(age);
//        super.eat();
    }

    public Dog(){
        System.out.println("子类的无参构造方法！");
    }

    @Override
    public String toString(){
        return "dog's age is:" +age;
    }

}
