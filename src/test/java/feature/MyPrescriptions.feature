Feature: My Prescriptions

  @Android
  Scenario: Verify My Lab reports works
    Given User enters Mobile "<Number>" in Mobile# field
    When user enters# "<password>" in the password field
    And Tap on Submit tab
    And Tap on Navbar
    Then Tap on My Prescriptions