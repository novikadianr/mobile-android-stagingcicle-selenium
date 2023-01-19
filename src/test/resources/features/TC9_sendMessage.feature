Feature: Send Message on Group Chat
  Scenario: User successfully send message
    Given user is on app home
    And user has created company
    And user already has team
    When user click menu group chat
    And user input message
    And user click icon send message button
    Then user verify message result

