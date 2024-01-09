Feature: List of scenarios.
Scenario Outline: Pass data using datatable with example
Given credentials are given "<username>" , "<password>" , "<email>"
    Examples:  
      | username | password | email  |
      | admin |  manager | admin@123 |
      | admin1 | manager1 | admin@1234 |