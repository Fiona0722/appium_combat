package com.fanxx.appiumcombat.testdemo;
import java.io.File;
import java.io.FileOutputStream;
public class SearchStringEmp {
    public static void main(String args[]) {
        //使用String类的indexof方法，在字符串中查找子字符串出现的位置，如果存在返回字符串出现的位置，第一位为0，如果不存在返回－1；
        String stringOriginal = "hello world!";
        int intIndex = stringOriginal.indexOf("world");
        if (intIndex == -1) {
            System.out.println("没有找到字符串world");
        } else {
            System.out.println("world字符串位置 " + intIndex);
        }
    }
}