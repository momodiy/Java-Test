package com.rentCar;

/**
 * Created by stevenlee on 2018/1/24.
 */
class SeatCar extends Car {
    SeatCar(int id, int seat, int heavy, int price, String name) {
        super(id, seat, 0, price, name);
    }

    @Override
    public String showCar(){
        return id+".\t"+name+"\t"+price+"元/天\t载人：" +seat+"人";
    }
}

