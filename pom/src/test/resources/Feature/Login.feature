@Login
Feature: Login features
This feature includes scenario that would validate the following features.
1. Login as Admin
2. Login as Linda.anderson
3. Login with Negavtive data

Background:
Given I am able to navigate onto login page

Scenario Outline: Login with different user
When I enter the username as "<user>" 
And I enter the password as "<pwd>" 
And I click on the login button
Then I should see the username as "<name>" 

Examples:
|user					|pwd						|name				|
|Admin				|admin123				|Welcome Britney|
|linda.anderson|linda.anderson|Welcome Britney|

@negative
Scenario: Login with Negative Data
Given I am able to navigate onto login page
When I enter the username as "Jayasree" 
And I enter the password as "Jayasree123" 
And I click on the login button
Then I should see the error as "Invalid credentials" 