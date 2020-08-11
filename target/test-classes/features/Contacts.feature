Feature: Contacts Feature



  Scenario Outline: Default page number
    Given the user is on the login page
    And the user enter the driver information
    When the user navigates to "Customers" then "Contacts"
    Then default page number should be <number>
    Examples:
    |number|
    |1     |
    |2     |
    |3     |


    @wip
    Scenario: Contacts test with email
      Given the user logged in as "store manager"
      And the user navigates to "Customers" then "Contacts"
      When the user clicks the "lacieabbott@gleasonkuphalandcrona.info" from contacts
#      Then the information should be same with the database

