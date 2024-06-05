Feature: Verify cart products

  Scenario: Verify the products moved to cart are visible in cart screen
    Given user launches browser
    And user enters respective url into the search field
    Then user navigates to login screen
    When user enters username and password into the respective fields
    And user clicks on the login button1
    Then user navigates to products screen
		When user adds required product to cart
		And user clicks on cart icon to navigate to cart screen
		Then user verifies all the cart products
		Then user closes browser