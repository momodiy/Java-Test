package com.imooc;

/**
 * Created by stevenlee on 2018/1/22.
 */

public class ImoocTest {
    public static void main(String[] args) {
        Telphone phone=new Telphone();
        System.out.println(phone.x);
        phone.runAway();
    }

}
//类名首字母大写
class Telphone{
    float screen;
    float cpu;
    float mem;

    //属性
    int x=999;
    //char 单个字符
    char b='w';
    //方法
    void runAway(){
        System.out.println("go fast");
    }
}