Feature: sign up for a membership plan

  @Android
  Scenario: Verify Membership Plan Button Works Properly
    Given User enters Mobile "<Number>" in Mobile# field
    When user enters# "<password>" in the password field
    And Tap on Submit tab
    And Tap on sign up for a membership plan
    Then Click Membership oK Button