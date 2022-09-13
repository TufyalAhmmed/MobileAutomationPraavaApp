Feature: Visit Map Location

  @Android
  Scenario: Verify Map Location Tab works Properly
    Given User enters Mobile "<Number>" in Mobile# field
    When user enters# "<password>" in the password field
    And Tap on Submit tab
    And Tap on Map
    And Tap on allow pop up
    Then Tap on Praava Health
