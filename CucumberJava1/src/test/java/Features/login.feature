#Name: Ravi
#Date: 8/17/2021
#Description: Demo of cucumber BDD
Feature: Feature to test Login functionality
@smoketest
Scenario: Check login is sucessful with valid credentials

Given user is on login page
When user enters username and password
And clicks on Login button
Then user is navigated to home page