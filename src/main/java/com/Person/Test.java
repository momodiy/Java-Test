package com.Person;

/**
 * Created by stevenlee on 2018/1/24.
 */
public class Test {

    public static void main(String[] args) {
        //多态使用前提：两个类有继承关系
        APerson p = new Chinese();
        APerson p2= new Americal();
        p.say();
        p2.say();


    }
}
