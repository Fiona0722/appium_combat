package com.fanxx.appiumcombat.testcases;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class TestNGDataProvider {
	  @DataProvider(name="test")
	  public static Object[][] testData(){
		return new Object[][]{{"fanxx"}};
	  }	  
	  @Test(dataProvider="test")
	  public void f(String str1){
		  System.out.println("打印出："+str1);
		  
	  }



}
