Feature: Logout Functionality
  Scenario: User successfully log out application
    Given user is on app home
    When user click menu
    And user click logout button
    Then user verify logout result