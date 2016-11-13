Feature: Verify HDFC page
In order to check the HDFC page

Scenario Outline: Verify HDFC page
Given I open firefox browser
When I navigate url application
Then I clicked on credit card icon
And I select popup window
#Scenario Outline: Fill the Credit card app form
Given Fill credit card application from "<firstname>","<lastname>"
And close the application

Examples:
|firstname|lastname|
|Vijay|Software|
|govardhan|testing|
