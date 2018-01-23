package com.phone;

/**
 * Created by stevenlee on 2018/1/23.
 */
public class Cellphone extends Telphone{
    @Override
    public void call(){
        System.out.println("通过键盘按键打电话");

    }

    @Override
    public void message(){
        System.out.println("通过键盘按键发短信");

    }
}

