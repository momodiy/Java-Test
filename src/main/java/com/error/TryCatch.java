package com.error;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by stevenlee on 2018/1/25.
 */
public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Please enter first number:");
            int one=sc.nextInt();
            System.out.println("Please enter second number:");
            int two=sc.nextInt();
            System.out.println(one/two);
        }catch (InputMismatchException e){
            System.out.println("输入不匹配");
        }catch(ArithmeticException e){
            System.out.println("第二个数字不能为0");
        }finally {
            System.out.println("呵呵");
        }
        System.out.println("Next...");

    }
}
