Feature: SignUp

  @Android

  Scenario Outline: Verify SignUp Page Appears

    Given Tap on SignUp Tab
#    And User enters Country "<Code>" in the Country code field
    And   User enters Mobile "<Number>" in number field
    And User enters "<name>" in the name fields
    And user enters "<password>" in the password field
    And user enters "<repassword>" re-Enter password field
    And user enters "<email>" in email field
    Then Tap on Sign Up
    Examples:
      | Code | Number     | name   | password  | repassword | email                 |
      | +880 | 1679560509 | Tufyal | tufyal12! | Tufyal12!   | tufyal.qups@gmail.com |




