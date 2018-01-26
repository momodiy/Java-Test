package com.exception;

/**
 * Created by stevenlee on 2018/1/25.
 */
public class TryCatchTest {
    public static void main(String[] args) {
    TryCatchTest tct=new TryCatchTest();
    int result=tct.test();
        System.out.println("返回结果为："+result);
    }

    /**
     * @prame divider
     * @prame res
     * @return
     */
    public int test(){
        int divider=10;
        int res=100;
        try{
            while(divider>0){
                divider--;
                res+=100/divider;
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("while error!");
            res=99999;
        }finally {
            System.out.println("this is finally result！");
            System.out.println(res);
        }
        System.out.println("Interesting");
        return res;
    }
}
