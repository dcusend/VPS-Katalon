Feature: Admin Suite Login Feature

  Scenario: Test Admin Suite Login with valid credentials
    Given User navigates to Admin Suite Login page
    When User enters username and password
    And User selects the Sign In button
    Then User is navigated to Dashboard page
     
