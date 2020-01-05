Feature: Login
  As user, I want to be able to login into Odoo
  us a purchasing manager


  @purchasing_manager
  Scenario: Login as purchasing manager
    Given user is on the login page
    Then user logs in as purchasing manager
    And user verifies that "Home" page is displayed



