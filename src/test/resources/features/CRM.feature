Feature: CRM

  @CreateOpportunity
  Scenario: Create an Opportunity
    Given user is on the login page
    Then user logs in as purchasing manager
    Then user navigates to "CRM" module
    Then user click create button
    Then user enters "Holiday Season Sales" into opportunity box
    Then user enters "500000" into expected revenue box
    Then user selects priority level as "1"
    And user selects create button
    And user verifies that "Holiday Season Sales" is displayed


  @CreateOppurtunity_SelectAPerson
  Scenario: Create an Opportunity for a selected person
    Given user is on the login page
    Then user logs in as purchasing manager
    Then user navigates to "CRM" module
    Then user click create button
    Then user enters "Employee Discount" into opportunity box
    Then user clicks dropdown menu
    Then user selects Search More
    Then user selects a person and
    Then user enters "200" into expected revenue box
    Then user selects priority level as "2"
    And user selects create button
    And user verifies that "Employee Discount" is displayed

