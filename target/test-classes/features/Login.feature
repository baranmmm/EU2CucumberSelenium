@login
Feature: Users should be able to login

  Background:
    Given the user is on the login page

  @driver  @smoke
  Scenario: Login as a driver
    When the user enter the driver information
    Then the user should be able to login

  @storeManager
  Scenario: Login as a store manager
    When the user enter the store manager information
    Then the user should be able to login

    @wip
    Scenario: login as dynamically
      When the user logged in as "store manager"
      Then the user should be able to login
      And the title should be "Dashboards"


  @salesManager @smoke
  Scenario: Login as a sales manager

    When the user enter the sales manager information
    Then the user should be able to login
    #comment can be written by # sign
