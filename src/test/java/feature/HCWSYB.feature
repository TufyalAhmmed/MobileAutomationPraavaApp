Feature: HCWSYB Button

  @Android
  Scenario: Verify HCWSYB Button Works Properly
    Given User enters Mobile "<Number>" in Mobile# field
    When user enters# "<password>" in the password field
    And Tap on Submit tab
    And Click How can we serve you better Button
    Then Click Membership oK Button