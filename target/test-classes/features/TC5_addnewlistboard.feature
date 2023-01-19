Feature: Add new List
  Scenario: User successfully add new list
    Given user is on app home
    And user has created company
    And user already has team
    When user click menu board
    And user click iconplus
    And user input list name
    And user click submit button
    Then user verify addlist result
