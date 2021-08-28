/**
 * 
 */
package com.orangehrm.pages;

import org.openqa.selenium.By;

import net.thucydides.core.pages.PageObject;

/**
 * @author Pinky Biswas
 *
 */
public class SystemUserPage extends PageObject {
	
	private By addBtn= By.id("btnAdd");
	
	
	
	public void clickOnAddBtn() {
		
		$(addBtn).click();
	}

}
