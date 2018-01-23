package com.phone;

/**
 * Created by stevenlee on 2018/1/23.
 */
public class Init {
    public static void main(String[] args) {
         Telphone tel1=new Cellphone();
         tel1.call();
         tel1.message();

         Telphone tel2=new Smartphone();
         tel2.call();
         tel2.message();


    }
}
