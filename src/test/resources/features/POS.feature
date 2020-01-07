Feature:New Product in Point Of Sale page

  @POS_Activities
  Scenario:Create a New Product in Point Of Sale Page
    Given user is on the login page
    Then user logs in as purchasing manager
    Then user navigates to "Point of Sale" module
    Then user clicks Point of Sale module under the Configuration
    Then user click Create button
    Then user fills the Name of the Point of Sale with "Name"
    And user makes sure that Saving button is visible



