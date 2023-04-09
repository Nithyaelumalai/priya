Feature: Validation facebook Page
Scenario: Login with invalid credential 

When User is on login Page

And User enters username and password

And User click on Login page 

Then User verify the error message
