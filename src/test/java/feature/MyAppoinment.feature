Feature: My Appointments

  @Android
  Scenario: Verify My appointments and past appointments works
    Given User enters Mobile "<Number>" in Mobile# field
    When user enters# "<password>" in the password field
    And Tap on Submit tab
    And Tap on Navbar
    Then Tap on my appoinments
    And Tap on past Appointments
