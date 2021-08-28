package com.orangehrm.serenitysteps;

import org.junit.Assert;

import com.orangehrm.pages.AdminLoginPage;

import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Step;

/**
 * @author Pinky Biswas
 * 
 *         This class will include all the steps to execute specific
 *         functionalities pertaining to Login page
 */
public class AdminLoginSteps {

	private AdminLoginPage adminLoginPage;

	@Step("User lands on Login Page")
	public void openOrangeCRMApp() {

		adminLoginPage.open();

	}

	@Step("User enters username and password")
	public void doEnterUserNameandPassword(String user_name, String pwd) {

		adminLoginPage.enterUserName(user_name);
		adminLoginPage.enterPassword(pwd);
	}

	@Step("User performs login")
	public void doLogin() {
		
		adminLoginPage.clickOnLoginBtn();

	}
	
	
	@Step("User is logged in with username: {0} and password: {1}")
	public void doLoginWithCredentials(String uname, String pwd) {
		
		adminLoginPage.loginWithCredentials(uname, pwd);
	}

	@Step("User clicks on forgot Password Link")
	public void doChangePwdwithForgotPwdLink() {

		adminLoginPage.clickOnForgotPasswordLink();
	}

	@Step
	@Pending
	public void validateInvalidCredentialsMsg(String uname, String pwd) {
		String invalidMsg = adminLoginPage.invalidCredentialsError();
		if(uname!="Admin" || pwd!="admin123") {
			
			
		}

	}
	
	@Step("User navigatesto Forgot Passwrord Link")
	public void doChangePassword() {
		adminLoginPage.clickOnForgotPasswordLink();
	}
}
