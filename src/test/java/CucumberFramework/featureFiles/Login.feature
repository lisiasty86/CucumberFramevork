Feature: Login into account
  Existing user should be able to login to account using correct credentials

  Scenario: Login into account with correct credentials
    Given User navigates to stackoverflow website
    Given User clicks on the login button
    Given User enters a correct username
    Given User enters a correct password
    When User clicks on the login buttonx
    Then User should be taken to the successful login page