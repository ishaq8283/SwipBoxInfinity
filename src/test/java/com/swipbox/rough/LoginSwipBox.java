package com.swipbox.rough;

import java.io.IOException;

import com.swipBox.pages.LoginSwipBoxHome;
import com.swipBox.pages.SwipBoxHOme;

public class LoginSwipBox {

	public static void main(String[] args) throws InterruptedException, IOException {


		LoginSwipBoxHome login = new LoginSwipBoxHome();
		login.doLogin("waqar.ali@softteams.com", "12345678");
		// Thread.sleep(3000);
		SwipBoxHOme Shipments = new SwipBoxHOme();
		Shipments.goToShipments();
	}

}
