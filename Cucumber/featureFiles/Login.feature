@login 
Feature: Login
Scenario: Valid login
Given User navigates to url "http://localhost/login.do"
When user enters valid username as "admin" 
And user enters valid password as "manager"
And clicks on login button
Then Home page should be displayed 