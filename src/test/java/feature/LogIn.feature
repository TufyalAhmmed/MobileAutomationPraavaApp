Feature: LogIn Page

@Android

  Scenario Outline: Verify user in HomePage
    Given User In the front page
    When User enters Mobile "<Number>" in Mobile# field
    And  user enters# "<password>" in the password field
    Then Tap on Submit tab
  Examples:
  |Number    |  password  |
  |1679560509|  Tufyal12! |

