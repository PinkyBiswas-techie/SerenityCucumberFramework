/**
 * 
 */
package com.orangehrm.serenitysteps;

import org.junit.Assert;

import com.orangehrm.pages.ForgotYourpasswordPage;

import net.thucydides.core.annotations.Step;

/**
 * @author Pinky Biswas
 *
 */
public class ForgotYourPasswordPageSteps {

	ForgotYourpasswordPage forgotYourpasswordPage;
	
	@Step("validate user is on Forgot Your Password Page")
	public void validatePageHeader(String pageHeader) {
		
		Assert.assertEquals(forgotYourpasswordPage.getPageHeader(), pageHeader);
		
	}

}
