Feature: LogOut

  @Android

  Scenario: Verify LogOut Tab works user in FrontPage
   Given User enters Mobile "<Number>" in Mobile# field
    When user enters# "<password>" in the password field
    And Tap on Submit tab
    And Tap on Navbar
    And Scroll till end
    Then Tap on LogOut Tab