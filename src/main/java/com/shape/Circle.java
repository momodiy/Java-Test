package com.shape;

/**
 * Created by stevenlee on 2018/1/23.
 */
public class Circle extends Shape{
    int len=13;
    @Override
    public void getPerimeter() {
        System.out.println("Circle area is:"+len*4);
    }

    @Override
    public void getArea() {
        System.out.println("Circle perimeter is:"+len*len);
    }
}
