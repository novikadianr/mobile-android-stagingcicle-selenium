Feature: Fill forms

  Scenario: Fill forms

    Given user is on app home
    When user click createnewcompany button
    And user input company name
    And user input company desc
    And user click create button
    Then user verify createnewcompany result