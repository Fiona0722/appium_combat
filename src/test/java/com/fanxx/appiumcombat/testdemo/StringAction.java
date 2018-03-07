package com.fanxx.appiumcombat.testdemo;

public class StringAction {
    public static void main(String args[]){
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);

        sBuffer.append("1,xx追加的字符串");
        System.out.println(sBuffer);
        sBuffer.reverse();
        System.out.println("2,反转后变成："+sBuffer);
        sBuffer.delete(1,3);
        System.out.println("3,移除前三个字符后："+sBuffer);
        sBuffer.replace(1,3,"fxx");
        System.out.println("4,用fxx代替1～3字符："+sBuffer);
    }
}
