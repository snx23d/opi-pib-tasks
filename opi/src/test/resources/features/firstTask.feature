@complete
Feature: First task

  Scenario: Testing the method with empty list
    Given I run the method with empty list
    Then I get the empty list back

  Scenario: Testing the method with a list of even and odd integers
    Given I run the method with complete list
    Then I get the list with only even numbers