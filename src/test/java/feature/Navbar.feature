Feature: navbar

  @Android
  Scenario Outline: Verify Navbar works Tap on navbar
    Given User enters Mobile "<Number>" in Mobile# field
    When user enters# "<password>" in the password field
    And Tap on Submit tab
    Then Tap on Navbar
    Examples:
      |Number    |  password  |
      |1679560509|  Tufyal12! |
