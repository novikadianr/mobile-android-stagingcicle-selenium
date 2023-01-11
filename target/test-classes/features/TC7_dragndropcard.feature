Feature: Drag card to other list
  Scenario: the user has successfully moved the card from the first list to the destination list
    Given user is on app home
    And user has company
    And user already has team
    And user already has list on board
    When user drop card
    Then user verify card moved result