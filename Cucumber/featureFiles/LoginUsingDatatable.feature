Feature: Actitime login
Scenario: Login using datatable
Given User is present in actitime login page
When User enters username and password
| admin|
|manager|
Then click on login button to go to home page

