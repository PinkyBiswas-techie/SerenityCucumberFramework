/**
 * 
 */
package com.orangehrm.serenitysteps;

import org.junit.Assert;

import com.orangehrm.pages.AddUserPage;

import net.thucydides.core.annotations.Step;

/**
 * @author Pinky Biswas
 *
 */
public class AddUserSteps {

	AddUserPage addUserPage;

	@Step("User selects User Role as: {0}")
	public void selectUserRole(String userRole) {

		addUserPage.selectUserRoleFromDropDown(userRole);

	}

	@Step("User enters Employee Name as : {0} and User Name as {1}")
	public void empAndUserName(String empName, String uName) {

		addUserPage.enterEmployeeName(empName);
		addUserPage.enterUserName(uName);

	}

	@Step("User selects status as : {0}")
	public void selectStatus(String status) {

		addUserPage.selectStatusFromDropDown(status);

	}

	@Step("User enters password as :{0}")
	public void enterPwd(String pwd) {
		addUserPage.enterPassword(pwd);

	}

	@Step("User re enters the password: {0}")
	public void reenterPwd(String pwd) {
		addUserPage.confirmPassword(pwd);

	}

	@Step("User clicks on Save Btn")
	public void saveUser() {

		addUserPage.clickOnSave();
	}

	@Step("Validate the Add User Page Title: {0} is correct ")
	public void addUserTitleValidation(String pageHeader) {

		Boolean actualHeader = addUserPage.getAddUserHeader().contains(pageHeader);

		Assert.assertTrue(actualHeader);

	}
}
