/**
 * 
 */
package com.orangehrm.serenitysteps;

import org.junit.Assert;

import com.orangehrm.pages.DashboardPage;

import net.thucydides.core.annotations.Step;

/**
 * @author Pinky Biswas
 *
 */
public class DashboardPageSteps {

	private DashboardPage dashboardPage;

	@Step("validate user lands on Dashboard Page successfully")
	public void validatePageTitle() {

		// Assert.assertEquals("OrangeHRM",dashboardPage.getDashboardTitle());
		Assert.assertEquals("Dashboard", dashboardPage.getDashboardTitle());

	}

	@Step
	public void validateDashboardURL() {

		String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(dashboardPage.getCurrentURL().toString(), expectedURL);
		// Assert.assertTrue(dashboardPage.getCurrentURL().toString());

	}

	@Step("User clicks on Admin Menu in Dashboard Page")
	public void doClickOnAdminMenu() {

		dashboardPage.clickOnAdminMenu();

	}

	@Step("User lands on user management Page")
	public void userOnUserManagementPage(String pageHeader) {

		Assert.assertTrue(dashboardPage.getUserMgmtPageHeader().contains(pageHeader));
	}

}
