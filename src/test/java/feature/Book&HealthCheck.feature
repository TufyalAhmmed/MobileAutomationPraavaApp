Feature: Book a healthcheck

  @Android
  Scenario Outline: Verify book a health check button works
    Given User enters Mobile "<Number>" in Mobile# field
    And user enters# "<password>" in the password field
    And Tap on Submit tab
    Then Tap book a healthcheck Button

    Examples:
      |Number    |  password  |
      |1679560509|  Tufyal12! |
