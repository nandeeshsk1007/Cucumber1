Feature: Test login functionality

  Scenario: Check wheather login functionality is working as expected
    Given user opens the browser
    And user open the app
    When user enters un and pwd
    And user clicks on login button
    Then user navigates to home page
