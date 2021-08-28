Feature: Validate Admin user is able to navigate to various pages from Dashboard Page

  Background: 
    Given User has launched the Orange HRM Application to login


@TC001-SuccessScenario
  Scenario Outline: Validate user is able to navigate to User Management Page
    When admin user log in with valid Username <userName> and Password <password>
    Then User should land on Dashboard Page successfully
    When user clicks on Admin Menu in Dashboard page
    Then user should land on User Management Page with title as <pageHeader>
    
    Examples:
    |pageHeader|userName|password|
    |systemUser|Admin|admin123|

