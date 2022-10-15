Feature: This feature would be creating  calculator for Add and Subtract

  Scenario: To Add two numbers
    Given I have a calculator
    When I add 4 and 5
    Then I should get the result as 9

  Scenario Outline: To Add two numbers
    Given I have a calculator
    When I add <int1> and <int2>
    Then I should get the result as <int3>

    Examples: 
      | int1 | int2 | int3 |
      |    1 |   10 |   11 |
      |   12 |   12 |   24 |
      |   10 |   11 |   21 |

  @sanity
  Scenario: To Add two numbers
    Given I have a calculator
    When I add the below numbers
      | 1 |
      | 1 |
      | 1 |
      | 1 |
      | 1 |
    Then I should get the result as 5
