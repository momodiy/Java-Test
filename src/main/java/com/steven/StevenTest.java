package com.steven;

/**
 * Created by stevenlee on 2018/1/22.
 */
public class StevenTest {
    public static void main(String[] args) {
        /*
        * 构造方法重载：
        * 方法名相同，参数名不同的多个方法，调用时会根据不同的参数调用不同的方法
        */
        //无参构造方法
        Init in = new Init();
        //有参构造方法
        Init on = new Init(4.123f,5f,9f);
        System.out.println(in.year);
//        System.out.println(in.month); //Error: private方法不可直接访问
        System.out.println(in.getMonth());
    }
}
