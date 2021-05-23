Feature: Login to the Leaftaps Application

Background:

Given Load URL 'http://leaftaps.com/opentaps'

Scenario Outline: Login Multiple Data

When Type username as <username>
And Type password as <password>
And Click Login Button
Then Verify Login is successful

Examples:
|username|password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|




















Scenario Outline: Login (Negative)

When Type username as <username>
And Type password as <password>
And Click Login Button
Then Verify Login Failed with error <ErrorMessage>

Examples:
|username|password|ErrorMessage|
| |crmsfa|username was empty reenter|
|DemoCSR| |password was empty reenter|