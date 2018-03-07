package com.fanxx.appiumcombat.testdemo;
// 使用 BufferedReader 在控制台读取字符
import java.io.*;
public class BRReadLines {
    public static void main(String args[]) throws IOException
    {
        // 使用 System.in 创建 BufferedReader，将声明的BufferedReader类型的对象br实例化
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");

        //readLine()方法：读取每一行的内容
        // 将输入的字符串赋值给str，用println打印出来，遇到当输入end时，跳出循环
        do {
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("end"));
    }
}