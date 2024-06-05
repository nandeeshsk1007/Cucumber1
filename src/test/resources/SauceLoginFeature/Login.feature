Feature: Swag Labs Login page

  Background: user is on login screen
	@regression
  Scenario: test the login with valid credentials
    Given user launches browser
    When user enters respective url into the search field
    And user navigates to login screen
    And user enters username and password into the respective fields
    And user clicks on the login button1
    Then user navigates to products screen

  Scenario: test the login with invalid username
    When user enters invalid iusername and valid password into the respective fields
    And user clicks on the login button1
    Then user gets proper error message for invalid username

  Scenario: test the login with invalid password
    When user enters valid username and invalid ipassword into the respective fields
    And user clicks on the login button1
    Then user gets proper error message for invalid password

	@regression
  Scenario: test the login with the empty fields
    When user clicks on login button without filling username and password fields
    And user clicks on the login button1
    Then user gets proper error message for empty fields
    Then user closes browser
