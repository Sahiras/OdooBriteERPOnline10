Feature: CRM

  @CreateOpportunity
  Scenario: Create an Opportunity
    Given user is on the login page
    Then user logs in as purchasing manager
    Then user navigates to "CRM" module
    Then user click create button
    Then user enters "Holiday Season Sales" into opportunity box
    Then user select "Serhat Gezer" from given options
    Then user enters "500000" into expected revenue box
    Then user selects priority level as "1"
    And user selects create button
    And user verifies that "Serhat Gezer" is displayed