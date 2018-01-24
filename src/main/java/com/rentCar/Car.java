package com.rentCar;

/**
 * Created by stevenlee on 2018/1/24.
 */
public class Car {

    public int id;
    public int seat;
    public int heavy;
    public int price;
    public String name;

    Car(int id,int seat,int heavy,int price,String name){
        this.id=id;
        this.heavy=heavy;
        this.seat=seat;
        this.price=price;
        this.name=name;

    }

    public String showCar(){
        return id+".\t"+name+"\t"+price+"元/天\t载人：" +seat+"人 载货："+heavy+"吨";
    }
}
