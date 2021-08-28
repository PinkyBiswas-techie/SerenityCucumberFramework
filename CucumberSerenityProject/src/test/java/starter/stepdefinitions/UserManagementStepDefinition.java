/**
 * 
 */
package starter.stepdefinitions;


import com.orangehrm.serenitysteps.SystemUserSteps;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * @author Pinky Biswas
 *
 */
public class UserManagementStepDefinition {
	
	@Steps
	SystemUserSteps systemUserSteps;
	
	@When("user clicks on Add button to add new user")
	public void user_clicks_on_add_button_to_add_new_user() {
		
		systemUserSteps.userNavigatesToAddUserPage();
	   
	}

	

}
