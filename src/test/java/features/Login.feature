Feature: Application Login

Scenario Outline: Loging in
Given Initialize the browser with chrome
And Navigate to qaclickacademy.com site
And Click on login link to land on sign in page
When User enters <username> and <password> and logs in
Then verify the user is successfully login
And close browsers

Examples:
|username			|password	|
|hello@gmail.com	|5564488	|
|navjot@yahoo.com	|efoeofioifo|