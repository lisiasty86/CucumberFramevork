Feature: Login into account
  Existing user should be able to login to account using correct credentials

  Scenario: Login into account with correct credentials2
    Given User navigates to stackoverflow website2
    Given User clicks on the login button2
    Given User enters a correct username2
    Given User enters a correct password2
    When User clicks on the login buttonx2
    Then User should be taken to the successful login page2