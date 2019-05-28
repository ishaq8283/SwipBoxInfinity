package com.swipbox.testcases;

import org.testng.annotations.AfterSuite;

import com.swipBox.base.Page;

public class BaseClass  {
@AfterSuite
public void tearDown() {
	Page.quit();
}
}
