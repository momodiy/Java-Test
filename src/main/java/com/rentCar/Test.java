package com.rentCar;

import java.util.Scanner;

/**
 * Created by stevenlee on 2018/1/24.
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("欢迎使用Steven租车系统");

        System.out.println("您是否要租车：1是 0否");

        isNeed();
    }


    public static void tip() {
        System.out.println("您的输入有误，请重新尝试!");
    }

    public static void isNeed() {
        boolean need=true;
        while (need) {
            String s = new Scanner(System.in).nextLine();
            if (s.equals("1")) {
                need=false;
                chooseCar();

                Rent cr=new Rent();
                cr.initial();
                cr.showCar();
                System.out.println("请输入您要租汽车的数量：");
                cr.rentCar(new Scanner(System.in).nextInt());

            } else if (s.equals("0")) {
                System.out.println("租车系统已退出！");
                break;
            } else {
                tip();
                isNeed();
            }
        }
    }

    public static void chooseCar(){

    }

}
