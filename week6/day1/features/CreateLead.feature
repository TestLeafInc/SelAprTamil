Feature: Create a new Lead in Leaftaps

Background:
Given Load URL 'http://leaftaps.com/opentaps'
And Type username as 'DemoSalesManager'
And Type password as 'crmsfa'
And Click Login Button
Then Verify Login is successful
And Click CRM SFA Link
And Click Leads Tab


@smoke @Hari
Scenario Outline: Create a new Lead with mandatory fields

When Click Create Lead Menu
And Type Company Name as <companyName>
And Type First Name as <firstName>
And Type Last Name as <lastName>
And Click Create Lead Button
And Verify the lead is created

Examples:
|companyName|firstName|lastName|
|TestLeaf|Hari|Radhakrishnan|
