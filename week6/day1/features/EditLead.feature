Feature: Edit an existing lead in Leaftaps

Background:
Given Load URL 'http://leaftaps.com/opentaps'
And Type username as 'DemoSalesManager'
And Type password as 'crmsfa'
And Click Login Button
Then Verify Login is successful
And Click CRM SFA Link
And Click Leads Tab

@sanity
Scenario Outline: Edit a lead by Phone Number

When Click Find Lead Menu
And Click Phone Tab
And Type Phone Number as <number>
And Click Find Leads Button
And Click First Matching Result

Examples:
|number|
|99|
|91|
