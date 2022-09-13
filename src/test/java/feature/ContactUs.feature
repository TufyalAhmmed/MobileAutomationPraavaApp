Feature: Contact Us

  @Android
  Scenario: Verify Contact Us Tab works properly
   Given User enters Mobile "<Number>" in Mobile# field
    When user enters# "<password>" in the password field
    And Tap on Submit tab
    Then Tap on Contact Us
