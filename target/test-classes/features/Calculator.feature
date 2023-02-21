Feature: Calculate mathematical expressions

  Background: 
    Given The user opens the browser and opens the calculator

  Scenario: Calculate expression
    When The user clicks on button "one"
    And The user clicks on button "zero"
    And The user clicks on button "subtract"
    And The user clicks on button "eight"
    And The user clicks on button "equals"
    Then Validate that "2" is displayed
    When The user clicks on button "multiply"
    And The user clicks on button "three"
    And The user clicks on button "equals"
    Then Validate that "6" is displayed
    And Close the browser
