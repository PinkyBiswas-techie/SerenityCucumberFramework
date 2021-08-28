#This feature will hold functionality related to only User management page
#Author: Pinky Biswas
Feature: As a Admin user, admin should be able to add new ESS users, new admin users, Delete existing users
  and search for an existing user

  Background: 
    Given User has launched the Orange HRM Application to login

  Scenario Outline: Verify user is able to add a new Employee with user role as Admin and ESS
    And admin user log in with valid Username <userName> and Password <password>
    Then User should land on Dashboard Page successfully
    When user clicks on Admin Menu in Dashboard page
    Then user should land on User Management Page with title as <pageHeader>
    When user clicks on Add button to add new user
    And user lands on Add User page with title as <pageHeaderAddUser>
    And user selects user role as <userRole> in Add User page
    And user enters Employee Name <empName> and User Name <userName1> in Add User page
    And user selects status as <status> in Add User page
    And user enters initial password <pass> in Add User page
    And user re-enters the initial password <pass> in Add User page
    Then user clicks on Save button
    
    
    
    Examples:
    |pageHeader|userName|password|pageHeaderAddUser|userRole|empName|userName1|status|pass|
    |systemUser|Admin|admin123|Add User|Admin|Anthony Nolan|Srishti|Enabled|Selenium|
    |systemUser|Admin|admin123|Add User|ESS|Anthony Nolan|Prisha|Enabled|Selenium|
    