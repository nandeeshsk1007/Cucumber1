Feature: Search for an information

  Scenario: Check whether we are getting correct information
    Given User opens a browser
    And Enters a text into the search field
    When User clicks Enter Key
    Then User navigates to search results page
