@login @smoke
Feature: Login
@valid
Scenario: Valid login
Given Dinga is present in actitime login page
When He enters valid username and password as "admin" and "manager"
And click on login button
Then home page of actitime will be displayed 
@invalid
Scenario: Invalid login
Given Dinga is present in actitime login page
When He enters invalid username and password as "admin1" and "manager1"
And click on login button
Then home page of actitime will not be displayed