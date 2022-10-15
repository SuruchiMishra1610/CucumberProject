Feature: Login Feature Scenarios

  Background: 
    Given I have launched the application
    And I click on Login Link

  
  Scenario: This scenario is to define the login happy path
    When I enter the correct username and password.
    And I click on Login Button
    Then I should land on the home page

  Scenario: This scenario is to define the failure path
    When I enter the incorrect uername and password
    And I click on Login Button
    Then I should get the error message "The email or password you have entered is invalid."

  @sanity
  Scenario: This scenario is to define the failure path
    When I enter the username as "scenario@3.com" and password as "Abc@1234"
    And I click on Login Button
    Then I should get the error message "The email or password you have entered is invalid."

  Scenario Outline: This scenario is to define the failure path
    When I enter the username as "<UserName>" and password as "<Password>"
    And I click on Login Button
    Then I should get the error message "The email or password you have entered is invalid."

    Examples: 
      | UserName            | Password  |
      | Scenario5@gmail.com | Abc@1234  |
      | Sce6@gmail.com      | Abc@12345 |
