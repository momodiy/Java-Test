package com.polymorphism;

/**
 * Created by stevenlee on 2018/1/23.
 */
public class Init {
    public static void main(String[] args) {
        //多态
        Animal ani1=new Animal();
        //父类引用可以指向子类对象
        Animal pig = new Dog();
        ani1.eat(); //父类对象的吃方法
        pig.eat();  //子类对象的吃方法
        //子类引用不能指向父类对象
        //Dog sheep =new Animal();

//        pig.run();

        Dog dog=new Dog();
        Animal animal=dog;//自动类型提升 向上类型转换

        if(animal instanceof Dog){
            System.out.println("强制类型转换成功");
            Dog dog1=(Dog)animal;//强制类型转换 向下类型转换
        }else{
            System.out.println("找不到无法进行转化");
        }

//        Cat cat =(Cat)animal;
    }
}
