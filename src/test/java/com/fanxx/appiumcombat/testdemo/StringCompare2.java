package com.fanxx.appiumcombat.testdemo;

public class StringCompare2 {
    public static void main(String args[])
    {
        String string1="fanxx";
        String string2="XingXf";
        boolean compresult1=string1.regionMatches(4,string2,5,1);
        boolean compresult2=string1.regionMatches(true,4,string2,5,1);
        System.out.println("不忽略大小写："+compresult1);
        System.out.println("忽略大小写："+compresult2);
    }
}
