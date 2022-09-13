Feature: link your + your family's account Button

  @Android
  Scenario: Verify Family's Account Button Works Properly
    Given User enters Mobile "<Number>" in Mobile# field
    When user enters# "<password>" in the password field
    And Tap on Submit tab
    And Click link your + your family's accounts Button Button
    Then Click Family Account oK Button