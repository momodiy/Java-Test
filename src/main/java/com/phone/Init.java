package com.phone;

/**
 * Created by stevenlee on 2018/1/23.
 */
public class Init {
    public static void main(String[] args) {
         Telphone tel1=new Cellphone();
         tel1.call();
         tel1.message();

         Telphone tel2=new Smartphone();
         tel2.call();
         tel2.message();

        IPsp ip1=new Smartphone();
        ip1.playGame();
        IPsp ip2=new Psp();
        ip2.playGame();

        IPsp ip3 = new IPsp() {
            @Override
            public void playGame() {
                System.out.println("匿名内部类实现接口的方式");
            }
        };
        ip3.playGame();

        IPsp ip4 =()-> System.out.println("匿名内部类！！！！！！！");
        ip4.playGame();
    }
}
