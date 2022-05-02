Feature: Multi user Account creation

  Scenario Outline: Game on mobile Account
    Given User in google home page
    Given google title test
    When user in Game on mobile homepage
    When Game on mobile title test
    When user enters <firstname> and <lastname> and <email> and <country>
    Then user clicks submit

    Examples: 
      | firstname   | lastname | email                     | country |
      | Automation1 | Test1    | Automationtest1@gmail.com |       1 |
      | Automation2 | Test2    | Automationtest2@gmail.com |       2 |
