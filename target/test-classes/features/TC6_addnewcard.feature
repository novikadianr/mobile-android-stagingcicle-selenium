Feature: Add New Card
  Scenario: User successfully add new card
    Given user is on app home
    And user has company
    And user already has team
    And user already has list on board
    When user click addnewcard button
    And user input name card
    And user click ceklist button
    Then user verify addcard result