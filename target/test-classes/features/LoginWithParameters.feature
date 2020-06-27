Feature: Login as different users


  Scenario: login as a driver user
    Given the user is on the login page
    When the user logs in using "user1" username and "UserUser123" password
    Then the user should be able to login
    And the title should be "Dashboard"

  @wip
  Scenario: login as a given user
    Given the user is on the login page
    When the user logs in using following credentials
      | username  | user1       |
      | password  | UserUser123 |
      | firstname | John        |
      | lastname  | Doe         |
    Then the user should be able to login

  @scenario_outline2
  Scenario Outline: login with different roles
    Given the user is on the login page
    When the user logs in using following credentials
      | username  | <userName>  |
      | password  | UserUser123 |
      | firstname | <firstname> |
      | lastname  | <lastname>  |

    Examples:
      | userName        | firstname | lastname |
      | user1           | John      | Doe      |
      | salesmanager101 | Peyton    | Harber   |
