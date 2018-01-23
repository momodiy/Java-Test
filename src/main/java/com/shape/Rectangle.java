package com.shape;

import static java.lang.Math.PI;

/**
 * Created by stevenlee on 2018/1/23.
 */
public class Rectangle extends Shape{
    int len=8;
    @Override
    public void getArea() {
        System.out.println("Rectangle area is:"+String.format("%.2f",len*len* PI));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Rectangle perimeter is:"+String.format("%.2f",2*len*PI));
    }
}
