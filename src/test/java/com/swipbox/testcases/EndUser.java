package com.swipbox.testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.swiBox.shipments.ShipmentEndUserPage;
import com.swipBox.utities.Utilities;


public class EndUser extends BaseClass {
	@Test
	public void endUser() throws IOException {
		ShipmentEndUserPage endUserNav=new ShipmentEndUserPage();
		endUserNav.shipmentEndUser();
	}
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void searchEndUser(Hashtable<String,String> data) throws IOException, InterruptedException {
		ShipmentEndUserPage searchEndUser=new ShipmentEndUserPage();
		Thread.sleep(1000);
		searchEndUser.searchEndUser(data.get("filter"), data.get("search"));
		Thread.sleep(1000);
		searchEndUser.ShipmentEndUserSearchVerify(data.get("filter"),data.get("search"));
		Thread.sleep(1000);
		searchEndUser.clear();
		
	}
//	@Test
//	public void endUserDetail() throws IOException, InterruptedException {
//		ShipmentEndUserPage searchEndUser=new ShipmentEndUserPage();
//		searchEndUser.ShipmentEndUserDetail();
//		Thread.sleep(3000);
//	}
}
