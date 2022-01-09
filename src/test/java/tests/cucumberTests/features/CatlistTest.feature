@login
Feature: Verify listing functionality on catify app

  Background: Create an instance of android or ios driver before each scenario
    Given User has catify "android" app

    Scenario: User should be able to verify cat listing
      When user views listing screen
      And user clicks Cat listing card
      Then User verifies Cat name exists
      And User verifies Cat Temperament exists
      And User verifies Cat Energy Level exists



