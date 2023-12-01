Feature: practicing search functionality

@caglar
  Scenario: search functionality verification
    Given user is on the main page of "expandtesting"
    When  user enter "dynamic" into search box
    Then user should see 7 as a number of element
    When user refresh the page
    And  user enter "drop" into search box
    Then  user should see 3 as a number of element



