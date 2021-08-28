/**
 * 
 */
package starter.stepdefinitions;

import org.jruby.RubyGlobal.StringGlobalVariable;

import com.orangehrm.pages.SystemUserPage;
import com.orangehrm.serenitysteps.AddUserSteps;
import com.orangehrm.serenitysteps.AdminLoginSteps;
import com.orangehrm.serenitysteps.DashboardPageSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * @author Pinky Biswas
 *
 */
public class AddUserStepDefinition {

	@Steps
	AddUserSteps addUserSteps;

	@When("^user lands on Add User page with title as (.*)$")
	public void user_lands_on_add_user_page_with_title_as_add_user(String pageHeader) {

		addUserSteps.addUserTitleValidation(pageHeader);

	}

	@When("^user selects user role as (.*) in Add User page$")
	public void user_selects_user_role_as_admin_in_add_user_page(String userRole) {
		addUserSteps.selectUserRole(userRole);
	}

	@When("^user enters Employee Name (.*) and User Name (.*) in Add User page$")
	public void user_enters_employee_name_and_user_name_in_add_user_page(String empName, String uName) {
		addUserSteps.empAndUserName(empName, uName);
	}

	@When("^user selects status as (.*) in Add User page$")
	public void user_selects_status_as_in_add_user_page(String status) {
		addUserSteps.selectStatus(status);
	}

	@When("^user enters initial password (.*) in Add User page$")
	public void user_enters_initial_password_selenium_in_add_user_page(String pwd) {
		addUserSteps.enterPwd(pwd);
	}

	@When("^user re-enters the initial password (.*) in Add User page$")
	public void user_re_enters_the_initial_password_selenium_in_add_user_page(String pwd) {
		addUserSteps.reenterPwd(pwd);
	}

	@Then("user clicks on Save button")
	public void user_clicks_on_save_button() {
		addUserSteps.saveUser();
	}

}
