/**
 * 
 */
package com.orangehrm.serenitysteps;

import com.orangehrm.pages.SystemUserPage;

import net.thucydides.core.annotations.Step;

/**
 * @author Pinky
 *
 */
public class SystemUserSteps {
	
	SystemUserPage systemUserPage;
	
	@Step("User clicks on Add button on System User Page")
	public void userNavigatesToAddUserPage() {
		systemUserPage.clickOnAddBtn();
	}

}
