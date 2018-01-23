package com.phone;

/**
 * Created by stevenlee on 2018/1/23.
 */
public class Smartphone extends Telphone{
    @Override
    public void call() {
        System.out.println("支持语音电话");
    }

    @Override
    public void message() {
        System.out.println("支持语音短信");
    }
}
