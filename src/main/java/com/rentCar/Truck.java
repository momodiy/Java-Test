package com.rentCar;

/**
 * Created by stevenlee on 2018/1/24.
 */
public class Truck extends Car {
    Truck(int id, int heavy, int price, String name) {
        super(id, 0, heavy, price, name);
    }

    @Override
    public String showCar() {
        return id + ".\t" + name + "\t" + price + "元/天\t载货：" + heavy + "吨";
    }
}
