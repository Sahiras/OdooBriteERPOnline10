Feature: Login
  @pos_manager
  Scenario: Login with valid credential
    Given user is on the home page
    Then user logs in as pos manager
    And user verifies that "#Inbox" page subtitle is displayed

#  Scenario: Not able to login with invalid credential
#    Given user is on the home page
#    Then user logs in as scrum master
#    And user verifies that "#Inbox - Odoo" page subtitle is displayed

#@store_manager
#  Scenario: Login as store manager
#    Given user is on the login page
#    Then user logs in as store manager
#    And user verifies that "Dashboard" page subtitle is displayed
#
#  @driver
#  Scenario: Login as driver
#    Given user is on the login page
#    Then user logs in as driver
#    And user verifies that "Dashboard" page subtitle is displayed
#
#  @sales_manager
#  Scenario: Login as sales manager
#    Given user is on the login page
#    Then user logs in as sales manager
#    And user verifies that "Dashboard" page subtitle is displayed
#
#  @negative_test
#  Scenario: Verify that warning message is displayed when password is not correct
#    Given user is on the login page
#    Then user enters "storemanager85" username and "wrong" password
#    And user verifies that "Invalid user name or password." message is displayed
#
#  @negative_test
#  Scenario: Verify that warning message is displayed when username is not correct
#    Given user is on the login page
#    Then user enters "wrong_username" username and "UserUser123" password
#    And user verifies that "Invalid user name or password." message is displayed
#
#
#  @driver_with_data_table
#  Scenario: Login as driver (data table example)
#    Given user is on the login page
#    Then user logs in as driver with following credentials
#      | username | user160     |
#      | password | UserUser123 |
#    And user verifies that "Quick Launchpad" page subtitle is displayed
#
#  @login_with_role
#  Scenario: Login as driver
#    Given user is on the login page
#    Then user logs in as "driver"
#
#  @login_with_role
#  Scenario: Login as sales manager
#    Given user is on the login page
#    Then user logs in as "sales manager"
#
#  @login_with_role
#  Scenario: Login as store manager
#    Given user is on the login page
#    Then user logs in as "store manager"
#
#  @login_with_role_ddt
#  Scenario Outline: DDT example, Login as <role>
#    Given user is on the login page
#    Then user logs in as "<role>"
#
#    Examples: roles
#      | role          |
#      | driver        |
#      | sales manager |
#      | store manager |
#
#  @login_with_credentials_ddt
#  Scenario Outline: DDT example with credentials, Login as <username>
#    Given user is on the login page
#    Then user enters "<username>" username and "<password>" password
#
#    Examples:
#      | username        | password    |
#      | storemanager85  | UserUser123 |
#      | user160         | UserUser123 |
#      | salesmanager110 | UserUser123 |