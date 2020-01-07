@Employee
Feature: Employees Page

  Scenario: Create an Employee
    Given user is on the home page
    Then user logs in as pos manager
    And user click on "Create" button
    Then user adds new employee information
      | Name |  Work Location | Work Email      | Work Mobile | Work Phone |other Info|
      | John |  Columbus      | jonny@gmail.com | 123452154   | 3245234566 | Nothing  |
