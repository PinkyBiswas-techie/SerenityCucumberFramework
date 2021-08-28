Feature: As an Admin, user should be able to login to Orange HRM Application

  Background: 
    Given User has launched the Orange HRM Application to login

  @TC001-SuccessScenario
  Scenario Outline: Validate admin user is able to successfully login to Dashboard page with  user ID and password
    When User enters valid username <username> and User enters valid password <password>
    And User clicks on Submit button
    Then User should land on Dashboard Page successfully

    Examples: 
      | username | password  |
      | Admin    | admin123  |
      | Admin    | admin1234 |

  Scenario Outline: Validate admin user is able to navigate to forgot password Link page
    When User clicks on Forgot Your Password Link on Admin Login Page
    Then Verify the Page Header displayed in Forgot Password Link as <pageHeader>
    
    Examples:
    |pageHeader|
    |Forgot Your Password?|
