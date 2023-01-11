Feature: Add team functionality
  Scenario: User successfully create team
    Given user is on app home
    And user has created company
    When user click plus button
    And user click menuaddnewteam button
    And user input name team
    And user input desc team
    And user click create buton
    Then user verify addnewteam result