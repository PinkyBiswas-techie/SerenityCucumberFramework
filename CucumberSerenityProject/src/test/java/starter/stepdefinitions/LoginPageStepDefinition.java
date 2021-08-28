package starter.stepdefinitions;

import com.orangehrm.serenitysteps.AdminLoginSteps;
import com.orangehrm.serenitysteps.DashboardPageSteps;
import com.orangehrm.serenitysteps.ForgotYourPasswordPageSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginPageStepDefinition {

	@Steps
	AdminLoginSteps adminLoginSteps;

	@Steps
	DashboardPageSteps dashboardPageSteps;
	
	@Steps
	ForgotYourPasswordPageSteps forgotYourPasswordPage;

	@Given("User has launched the Orange HRM Application to login")
	public void user_has_launched_the_orange_hrm_application_to_login() {
		adminLoginSteps.openOrangeCRMApp();
	}

	@When("^User enters valid username (.*) and User enters valid password (.*)$")
	public void user_enters_valid_username_and_user_enters_valid_password(String username, String pwd) {
		adminLoginSteps.doEnterUserNameandPassword(username, pwd);
	}

	@When("User clicks on Submit button")
	public void user_clicks_on_submit_button() {
		adminLoginSteps.doLogin();
	}

	@Then("User should land on Dashboard Page successfully")
	public void user_should_land_on_dashboard_page_successfully() {
		dashboardPageSteps.validatePageTitle();
	}
	
	@When("User clicks on Forgot Your Password Link on Admin Login Page")
	public void user_clicks_on_forgot_your_password_link_on_admin_login_page() {
	    adminLoginSteps.doChangePwdwithForgotPwdLink();
	}

	@Then("^Verify the Page Header displayed in Forgot Password Link as (.*)$")
	public void verify_the_page_header_displayed_in_forgot_password_link_as_forgot_your_password(String pageHeader) {
		forgotYourPasswordPage.validatePageHeader(pageHeader);
	}
	
	@When("^admin user log in with valid Username (.*) and Password (.*)$")
	public void admin_user_log_in_with_valid_username_user_name_and_password_password(String uname, String pwd) {
	    adminLoginSteps.doLoginWithCredentials(uname, pwd);
	}

}
