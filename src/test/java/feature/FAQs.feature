Feature: FAQs

  @Android
  Scenario: Verify FAQs Button works
    Given User enters Mobile "<Number>" in Mobile# field
    When user enters# "<password>" in the password field
    And Tap on Submit tab
    And Tap on Navbar
    Then Tap on FAQs