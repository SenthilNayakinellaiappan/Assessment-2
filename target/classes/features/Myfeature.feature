Feature: APP Game Play

Scenario: Play the App to Even
    Given I have an App Game Play object
    When I play the game with number 4
    Then the result is "EVEN"

Scenario: Play the App to ODD
    Given I have an App Game Play object
    When I play the game with number 15
    Then the result is "ODD"
