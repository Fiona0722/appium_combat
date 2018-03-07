package com.fanxx.appiumcombat.testcases.more;
import java.util.Map;

import com.fanxx.appiumcombat.base.BasePrepare;
import com.fanxx.appiumcombat.pages.HomePage;
import com.fanxx.appiumcombat.pages.InitPage;
import org.testng.annotations.Test;
import com.fanxx.appiumcombat.pageshelper.HomePageHelper;
import com.fanxx.appiumcombat.pageshelper.InitPageHelper;
import com.fanxx.appiumcombat.pageshelper.MorePageHelper;

public class MorePage_001_UiCheckForMorePage_Test extends BasePrepare {
	
	@Test(dataProvider="testData")
	public void uiCheckForMorePage(Map<String, String> data){
		//去除欢迎界面和定位弹窗
		InitPageHelper.handleInit(appiumUtil, InitPage.byElements);
		//在首页上点击更多按钮
		HomePageHelper.clickOnHomePage(appiumUtil, HomePage.HP_BUTTON_MORE);
		//检查更多页面的文本
		MorePageHelper.checkMorePageUIText(appiumUtil, data.get("LOGIN"),data.get("HISTORY"),data.get("SETTINGS"),data.get("FEEDBACK"));
	}

}
