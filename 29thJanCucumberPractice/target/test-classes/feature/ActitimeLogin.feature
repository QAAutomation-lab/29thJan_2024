Feature: Actitime application login test

Scenario: Validate Actitime login flow with valid user
Given user in on actitime login page
When user enters valid username as "admin01"
And user enters valid password as "admin01"
And user clicks on login button
Then user should navigate to Actitime Home page with title "actiTIME - Licenses"
And user close the browser

Scenario: Validate Actitime login flow with invalid user
Given user in on actitime login page
When user enters valid username as "admin01"
And user enters valid password as "admin"
And user clicks on login button
Then user should remain in Actitime Login page with title "actiTIME - Login"
And user close the browser