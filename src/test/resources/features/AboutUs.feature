Feature: First test

  Scenario: As a user I want to be able to click on About Us module.

    Given user is on the dashboard page
    When user is hovering over About Us button
    And user clicks on the About Us button
    Then user has to be able to see drop down menu with 5 drop down options : About Us,The Company, The team, Company History
