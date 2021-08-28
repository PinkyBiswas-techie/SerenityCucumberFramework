/**
 * 
 */
package com.orangehrm.pages;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;

/**
 * @author HP
 *
 */
public class ForgotYourpasswordPage extends PageObject {
	
	private By pageHeader= By.xpath("//*[@id=\"content\"]/div[1]/div[2]/h1");
	
	
	/**
	 * 
	 * This will return Forgot your Password page Header
	 */
	public String getPageHeader() {
		
		return $(pageHeader).getText();
	}
}
