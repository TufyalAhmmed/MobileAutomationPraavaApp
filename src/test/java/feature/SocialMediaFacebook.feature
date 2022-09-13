Feature: Social Media

  @Android
  Scenario: Verify Social Media works Tap on navbar
    Given User enters Mobile "<Number>" in Mobile# field
    When user enters# "<password>" in the password field
    And Tap on Submit tab
    And Tap on Navbar
    And Tap on Social Media Button
    Then Social Media Facebook Button
