Feature: Transfer money with valid username and password 
Scenario: Login with correct id and password
Given Open Browser
When Open Url
And Input Id and Password
And Click submit button
And Click on the transfer button
And Put the amount and submit
Then Validate the page title

