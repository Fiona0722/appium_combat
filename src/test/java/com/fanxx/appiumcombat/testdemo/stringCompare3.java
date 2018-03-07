package com.fanxx.appiumcombat.testdemo;

public class stringCompare3 {
    public static void main(String args[]) {
        String str1 = "fiona";
        String str2= "Fiona";
        String str3 = "fanxx";
        String str4="i am fiona fan";
        int res1 = str1.compareTo(str2);  //结果是将不同字符串的值大小
        int res2 = str1.compareToIgnoreCase(str2);//结果是将不同字符串的值大小
        int res3 = str1.compareToIgnoreCase(str3);//结果是将不同字符串的值大小
        boolean res4=str1.equals(str2);  //结果是布尔值，false或true
        boolean res5=str1.equalsIgnoreCase(str2);  //结果是布尔值，false或true
        int resFind=str4.indexOf("f");

        System.out.println("区分大小写，比较结果是：" + res1);
        System.out.println("不区分大小写，比较结果是：" + res2);
        System.out.println("不区分大小写，比较结果是：" + res3);
        System.out.println("区分大小写，比较结果是：" + res4);
        System.out.println("不区分大小写，比较结果是：" + res5);
        System.out.println("不区分大小写，比较结果是：" + res5);
        System.out.println("字符串查找f字符位置为第" +resFind +"位");
    }
}
