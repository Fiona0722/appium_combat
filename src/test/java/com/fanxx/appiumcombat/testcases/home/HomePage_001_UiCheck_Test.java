package com.fanxx.appiumcombat.testcases.home;

import java.util.Map;

import com.fanxx.appiumcombat.base.BasePrepare;
import com.fanxx.appiumcombat.pages.InitPage;
import org.testng.annotations.Test;

import com.fanxx.appiumcombat.pageshelper.HomePageHelper;
import com.fanxx.appiumcombat.pageshelper.InitPageHelper;

public class HomePage_001_UiCheck_Test extends BasePrepare {
	
	@Test(dataProvider="testData")
	public void uiCheck(Map<String, String> data){
		//去除欢迎界面和定位弹窗
		InitPageHelper.handleInit(appiumUtil, InitPage.byElements);
		//等待首页元素加载，这个条件可以不要因为是原生APP的，代码都是在本地的，基本上打开了APP就显示了原生元素
		HomePageHelper.waitHomeUI(appiumUtil, elementTimeOut);
		//检查文本
		HomePageHelper.checkHomeUIText(appiumUtil, data.get("STORY"));
		
	}

}
