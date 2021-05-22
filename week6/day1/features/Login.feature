Feature: Login to the Leaftaps Application

Scenario: Login (Positive)

Given Launch Chrome browser
When Load URL 'http://leaftaps.com/opentaps'
And Type username as 'DemoSalesManager'
And Type password as 'crmsfa'
And Click Login Button
Then Verify Login is successful

Scenario: Login (Negative)

Given Launch Chrome browser
When Load URL 'http://leaftaps.com/opentaps'
And Type username as ''
And Type password as 'crmsfa'
And Click Login Button
Then Verify Login Failed with error 'username was empty reenter'

Scenario: Login (Negative 2)

Given Launch Chrome browser
When Load URL 'http://leaftaps.com/opentaps'
And Type username as 'DemoSalesManager'
And Type password as ''
And Click Login Button
Then Verify Login Failed with error 'password was empty reenter'

