Feature: Login functionalities

@smoketest
  Scenario: Checking the functionalities
    
    Given User is on the Login screen
    When User enters UN and PWD
    And Click on Login button
    Then User is navigated to Home screen