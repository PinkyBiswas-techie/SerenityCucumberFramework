/**
 * 
 */
package com.orangehrm.pages;

import org.openqa.selenium.By;

import com.google.inject.spi.PrivateElements;

import net.thucydides.core.pages.PageObject;

/**
 * @author Pinky Biswas
 *
 */
public class AddUserPage extends PageObject {

	private By addUserHeader = By.xpath("//div[contains(@id,'systemUser')]/div/h1[contains(text(),'Add User')]");
	private By userRoleDrpDwn = By.id("systemUser_userType");
	private By empNameFld = By.xpath("//input[contains(@id,'empName')]");
	private By userNameFld = By.xpath("//input[contains(@id,'userName')]");
	private By statusDrpDown = By.xpath("//*[contains(@id,'status')]");
	private By passWordBtn = By.xpath("//input[contains(@id,'password')]");
	private By confirmPwdBtn = By.xpath("//input[contains(@id,'confirmPassword')]");
	private By saveBtn = By.id("btnSave");

	public void selectUserRoleFromDropDown(String value) {

		$(userRoleDrpDwn).selectByVisibleText(value);

	}

	public void enterEmployeeName(String empName) {

		$(empNameFld).type(empName);

	}

	public void enterUserName(String uName) {

		$(userNameFld).type(uName);
	}
	
	public void selectStatusFromDropDown(String status) {
		
		$(statusDrpDown).selectByVisibleText(status);
		
	}
	
	public void enterPassword(String pwd) {
		
		$(passWordBtn).type(pwd);
	}
	
	public void confirmPassword(String pwd) {
		
		$(confirmPwdBtn).type(pwd);
	}
	
	public void clickOnSave() {
		
		$(saveBtn).click();
		
	}
	
	public String getAddUserHeader() {
		
		return $(addUserHeader).getText();
	}
}
