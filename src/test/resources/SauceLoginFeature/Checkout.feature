Feature: Order a product
Scenario: Order a product by providing valid address
    Given user launches browser
    And user enters respective url into the search field
    Then user navigates to login screen
    When user enters username and password into the respective fields
    And user clicks on the login button1
    Then user navigates to products screen
		When user adds required product to cart
		And user clicks on cart icon to navigate to cart screen
		And user clicks on checkout button
		And user fills delivery address
		And user verifies the product and total price to pay and clicks on finish button
		Then user verifies order confirmation message which is displayed on the screen
		Then user closes browser