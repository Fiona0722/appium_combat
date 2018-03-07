package com.fanxx.appiumcombat.testdemo;

import java.io.*;

//上面的程序首先创建文件test.txt，并把给定的数字以二进制形式写进该文件，同时输出到控制台上。
//以上代码由于是二进制写入，可能存在乱码，你可以使用以下代码实例来解决乱码问题

public class fileStreamTest{
    public static void main(String args[]){
        try{
            //定义一个二进制数组，里面是5个数字的二进制表示
            byte bWrite [] = {11,21,3,40,5};
            //创建文件test.txt
            OutputStream os = new FileOutputStream("test.txt");
            //当x小于数组长度时，执行写文件操作，将数组的值写入test文件中
            for(int x=0; x < bWrite.length ; x++){
                os.write( bWrite[x] ); // writes the bytes
            }
            //关闭os
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for(int i=0; i< size; i++){
                System.out.print((char)is.read() + "  ");
            }
            is.close();
        }catch(IOException e){
            System.out.print("Exception");
        }
    }
}