package com.orangehrm.pages;

import org.openqa.selenium.By;
import com.orangehrm.serenitysteps.DashboardPageSteps;
import net.thucydides.core.pages.PageObject;

/**
 * @author Pinky Biswas
 * 
 *         This Class will store all the web elements present in Admin Login
 *         Page
 */

public class AdminLoginPage extends PageObject {

	/**
	 * Locating all the Web Elements and storing them By reference
	 */

	private By userName = By.id("txtUsername");
	private By password = By.name("txtPassword");
	private By loginBtn = By.id("btnLogin");
	private By forgotPwdLinkBy = By.linkText("Forgot your password?");

	/**
	 * Create methods to handle functionalities on Login Page
	 */

	public void enterUserName(String user_Name) {

		$(userName).type(user_Name);

	}

	public void enterPassword(String pass) {

		$(password).type(pass);

	}

	public void clickOnLoginBtn() {

		$(loginBtn).click();

	}

	public void clickOnForgotPasswordLink() {

		$(forgotPwdLinkBy).click();

	}

	/*
	 * need to modify this method
	 */
	public DashboardPageSteps landsOnDashboardPage() {

		return new DashboardPageSteps();
	}

	public String invalidCredentialsError() {

		return $(By.xpath("//span[@id='spanMessage']")).getText();
	}

	public void loginWithCredentials(String uname, String pwd) {

		enterUserName(uname);
		enterPassword(pwd);
		clickOnLoginBtn();

	}

}
