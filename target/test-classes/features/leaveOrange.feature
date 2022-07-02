@Smoke
Feature: orangeHRM 

Scenario Outline: Login Orange-Demo Website
Given user is entering orngHRM page
When enter your "<userName>" and "<passWord>"
And click the login button

Examples: 
|userName	|passWord|
|Admin		|admin123|

Scenario: Leave Page
Given user to view leave page
Then Click in Apply tab to view applied leaves

Scenario: My Leave Page to view the available leave list and status of leave's
Given Click in My Leave tab to view all leaves
And User can select the thru date for the date range
And User can select the end date for  the date range
And Select All Checkbox to see all leave status
And Click only Rejected to see Rejected leaves
And Click only Cancelled to see Cancelled leaves
And Click only Pending Approval to see Pending Approval leaves
And Click only Scheduled to see Scheduled leaves
And Click only Taken to see Taken leaves
Then UnSelect All Checkbox to see deselect
Then Click on search button to view all the leaves status
Then Click on Reset button to reset Date selection and leave type
