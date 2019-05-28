package com.swipbox.testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.swiBox.shipments.ShipmentDataPage;
import com.swipBox.utities.Utilities;

public class ShipmentData extends BaseClass {
	@Test
	public void shipmentData() throws IOException {
		ShipmentDataPage spData=new ShipmentDataPage();
		spData.shipmentData();
		
	}
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void shipmentDataPiece(Hashtable<String,String> data) throws IOException, InterruptedException {
		ShipmentDataPage searchShipedData=new ShipmentDataPage();		
		searchShipedData.searchShipmentData(data.get("subject"), data.get("search"));
		Thread.sleep(1000);
		//searchShipedData.clearAllSearch();
		//Thread.sleep(3000);

	}

//	@Test
//	public void shipmentPieceDetail() throws IOException, InterruptedException {
//		ShipmentDataPage searchShipedData=new ShipmentDataPage();
//		searchShipedData.ShipmentDataDetail();
//		Thread.sleep(3000);
//	}

}
