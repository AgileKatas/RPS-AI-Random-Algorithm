Feature: Rock Paper Scissors AI | Random Algorithm

  Scenario: Returns only rock, paper, and scissors
    Given I am using a random algorithm
    When I produce 1000 moves
    Then the moves should contain:
      |Rock|Paper|Scissors|