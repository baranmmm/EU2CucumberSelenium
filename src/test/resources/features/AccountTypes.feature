Feature: Account types


  Scenario: Driver user
    Given the user logged in as "driver"
    When the user navigates to "Activities" then "Calendar Events"
    Then the title should be "Calendar Events - Activities"


  Scenario: Sales manager user
    Given the user logged in as "sales manager"
    When the user navigates to "Customers" then "Accounts"
    Then the title should be "Accounts - Customers"



  Scenario: Store manager user
    Given the user logged in as "store manager"
    When the user navigates to "Customers" then "Contacts"
    Then the title should be "Contacts - Customers"

  @scenario_outline
  Scenario Outline: <userType> user
    Given the user logged in as "<userType>"
    When the user navigates to "<module>" then "<type>"
    Then the title should be "<title>"

    Examples:
      | userType      | module     | type            | title                        |
      | driver        | Activities | Calendar Events | Calendar Events - Activitiess |
      | sales manager | Customers  | Accounts        | All - Accounts - Customers   |
      | store manager | Customers  | Contacts        | Contacts - Customers         |
