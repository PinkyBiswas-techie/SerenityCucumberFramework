package starter.stepdefinitions;

import com.orangehrm.serenitysteps.AdminLoginSteps;
import com.orangehrm.serenitysteps.DashboardPageSteps;
import com.orangehrm.serenitysteps.ForgotYourPasswordPageSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DashboardPageStepDefinition {

	
	@Steps
	DashboardPageSteps dashboardPageSteps;
	
	@Steps
	AdminLoginSteps adminLoginsteps;
	
	
	@Steps
	ForgotYourPasswordPageSteps forgotyourpassword;
	
	@When("user clicks on Admin Menu in Dashboard page")
	public void user_clicks_on_admin_menu_in_dashboard_page() {
		dashboardPageSteps.doClickOnAdminMenu();
	}

	@Then("^user should land on User Management Page with title as (.*)$")
	public void user_should_land_on_user_management_page_with_title_as(String pageHeader) {
		dashboardPageSteps.userOnUserManagementPage(pageHeader);
				
	}

}
