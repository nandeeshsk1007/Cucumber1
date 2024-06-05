Feature: Sample functionality

  Background: user is logged in
    Given user opens a browser
    And user enters login credentials
    When user clicks on send button
    Then user navigates to home screen

  Scenario: Sample
    When user clicks on profile icon
    Then user verifies whether logout is displayed

  Scenario: Sample1
    When user clicks on profile icon1
    Then user verifies whether logout is displayed1
