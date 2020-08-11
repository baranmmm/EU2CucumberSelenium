@navigate
Feature: Navigation menu title testing

  Scenario: Navigating Fleet -- Vehicles
    Given the user is on the login page
    When the user enter the sales manager information
    And the user navigates to Fleet, Vehicles
    Then title should be Vehicles

  Scenario: Navigating Marketing -- Campaigns
    Given the user is on the login page
    When the user enter the sales manager information
    And the user navigates to Marketing, Campaigns
    Then title should be Campaigns

  Scenario: Navigating Fleet -- Vehicles
    Given the user is on the login page
    When the user enter the sales manager information
    And the user navigates to Activities, Calendar Events
    Then title should be Calendar Events


  Scenario: Dynamic Navigation
    Given the user is on the login page
    When the user logs in using "salesmanager101" username and "UserUser123" password
    And the user navigates to "Customers" then "Contacts"
    Then the title should be "Contacts - Customers"
    Then default page number should be 1


  Scenario: Menu options
    Given the user is on the login page
    When the user logged in as "Sales Manager"
    Then the user should see the following options

      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |
