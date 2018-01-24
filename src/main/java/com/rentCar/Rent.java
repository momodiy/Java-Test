package com.rentCar;

import java.util.Scanner;

/**
 * Created by stevenlee on 2018/1/24.
 */
public class Rent {

    private Car[] car = new Car[6];

    void initial() {
        //载人类
        car[0] = new SeatCar(1, 4, 0, 500, "奥迪A4");

        car[1] = new SeatCar(2, 4, 0, 400, "马自达6");
        //载人载重类
        car[2] = new Car(3, 4, 4, 450, "皮卡雪6");
        car[3] = new SeatCar(4, 20, 0, 800, "金龙");
        //载重类
        car[4] = new Truck(5, 4, 400, "松花江");
        car[5] = new Truck(6, 20, 1000, "依维柯");
    }

    void showCar() {
        System.out.println("您可租车的类型及其价目表：");
        System.out.println("序号\t汽车名称\t租金\t容量");
        for (Car c : car) {
            System.out.println(c.showCar());
        }
    }

    void seatCar(int[] nums) {
        int tseat = 0;
        System.out.println("***可载人的车有：");
        for (int i = 0; i < nums.length; i++) {
            if (car[nums[i]].seat == 0) {
                continue;
            }
            System.out.print(car[nums[i]].name + "\t");
            tseat += car[nums[i]].seat;
        }
        System.out.println("共载人：" + tseat + "人");
    }

    void loadCar(int[] nums) {
        int tload = 0;
        System.out.println("***可载货的车有：");
        for (int i = 0; i < nums.length; i++) {
            if (car[nums[i]].heavy == 0) {
                continue;
            }
            System.out.print(car[nums[i]].name + "\t");
            tload += car[nums[i]].heavy;
        }
        System.out.println("共载货：" + tload + "吨");
    }

    void getMoney(int day, int[] nums) {
        int money = 0;
        for (int i = 0; i < nums.length; i++) {
            money += car[nums[i]].price;
        }
        System.out.println("***租车总价格：" + (money * day) + "元");
    }

    void rentCar(int num) {
        int[] nums = new int[num];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第" + (i + 1) + "辆车的序号：");
            nums[i] = in.nextInt() - 1;
        }
        System.out.println("请输入租车天数：");
        int day = in.nextInt();
        System.out.println("您的帐单：");
        seatCar(nums);
        loadCar(nums);
        getMoney(day, nums);
    }


}
