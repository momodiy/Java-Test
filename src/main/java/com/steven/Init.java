package com.steven;

/**
 * Created by stevenlee on 2018/1/22.
 */
public class Init {
    float screen;
    float cpu;
    private float mem;
    int year = 1998;
    private int month = 9;

    //空参构造
    public Init() {
        System.out.println("无参构造方法");
    }

    public int getMonth(){
        return month;
    }

    public void setMem(float newMem) {
        mem = newMem;
    }

    public Init(float newScreen, float newCpu, float newMem) {
        //对于float类型的数，使用时需指定类型（在数字后边加一个f）
        screen = newScreen < 3.5f ? 3.5f : newScreen;
        cpu = newCpu;
        mem = newMem;
        System.out.println("有参构造方法");
        System.out.println("屏幕大小：" + screen);
        System.out.println("CPU频率：" + cpu);
        System.out.println("内存参数：" + mem);
    }

}
