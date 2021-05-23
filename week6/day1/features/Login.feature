Feature: Login to the Leaftaps Application


@smoke @Babu
Scenario: Login (Positive)

Given Load URL 'http://leaftaps.com/opentaps'
And Type username as 'DemoSalesManager'
And Type password as 'crmsfa'
And Click Login Button
Then Verify Login is successful


Scenario: Login (Negative)

Given Load URL 'http://leaftaps.com/opentaps'
And Type username as ''
And Type password as 'crmsfa'
And Click Login Button
Then Verify Login Failed with error 'username was empty reenter'


Scenario: Login (Negative 2)

Given Load URL 'http://leaftaps.com/opentaps'
And Type username as 'DemoSalesManager'
And Type password as ''
And Click Login Button
Then Verify Login Failed with error 'password was empty reenter'

