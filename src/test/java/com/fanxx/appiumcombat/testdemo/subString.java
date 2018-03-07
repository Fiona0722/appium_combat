package com.fanxx.appiumcombat.testdemo;

public class subString {
    public static void main(String args[]){
         String str1="I am fiona.";
         String str2=new String();
         String str3=new String();
         str2=str1.substring(5);
         str2=str1.substring(5,8);
         System.out.print("str1的第5个字符后的字符串是："+str2+"\n");
         System.out.print("str1的第5~8个字符后的字符串是："+str3);

    }
}
