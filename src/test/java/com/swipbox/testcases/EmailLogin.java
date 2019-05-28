package com.swipbox.testcases;
import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.swipBox.pages.LoginSwipBoxHome;
import com.swipBox.utities.Utilities;
public class EmailLogin extends BaseClass {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void emailLogin(Hashtable<String,String> data) throws InterruptedException, IOException {
		LoginSwipBoxHome login=new LoginSwipBoxHome();
		//Remove last character from password
		String password = data.get("password").substring(0, data.get("password").length() - 1);
		login.doLogin(data.get("username"), password);
		Thread.sleep(3000);
		
	}

}