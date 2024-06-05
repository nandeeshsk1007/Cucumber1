Feature: Testing products listing

  Scenario: verifying the number of products listing on the page
    Given user launches browser
    And user enters respective url into the search field
    When user enters username and password into the respective fields
    Then user clicks on the login button1
    Then Check the number of products available on the page

  Scenario: verifying whether all the products have their title
    Then Check all the products have title

  Scenario: verifying whether all the products have add to cart button
    Then check all the products have add to cart button

  Scenario: verifying whether all the products have a image
    Then check all the products have a image

  Scenario: verifying if clicking on a product takes us to its detailed page
    Then user clicks on a product and verifies he has navigated to detailed screen

  Scenario: verify products are displayed in an alphabetical order
    When user clicks on filter button and selects az option
    Then check all the products are displaying in alphabetical order

  Scenario: verify products are displayed in reverse alphabetical order
    When user clicks on filter button and selects za option
    Then check all the products are displaying in reverse alphabetical order

  Scenario: verify products are displayed in low to higher price
    When user clicks on filter button and selects lohi option
    Then check all the products are displaying in low to higher price

  Scenario: verify products are displayed in high to low price
    When user clicks on filter button and selects hilo option
    Then check all the products are displaying in high to low price
    Then user closes browser
