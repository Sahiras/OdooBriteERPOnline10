Feature: Notes

  @createNewNotes
  Scenario: Create Notes page
    Given user is on the login page
    Then user logs in as purchasing manager
    Then user navigates to  "Notes" button
    And user click create button under Notes
    And user verifies that "text box" is available

