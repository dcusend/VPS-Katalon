Feature: Successful VT Sale Transaction 

Scenario: Successful Sale Transaction with No CF

Given User Logs into Admin Suite
When User selects a Payment Application with No CF on Dashboard page
And User selects Sale link on Issue Transactions page
And User selects Keyboard Entry link on Issue Transactions page
And User populates the Sale Keyboard Entry page
And User selects the Submit button on Sale Keyboard Entry page
Then User is presented with Sale Payment Receipt page
And User verifies all the information is correct on Sale Payment Receipt page
And User verifies CF is not charged on Sale Payment Receipt page



Scenario: Successful Sale Transaction with Single CF

Given User Logs into Admin Suite
When User selects a Payment Application with Single CF on Dashboard page
And User selects Sale link on Issue Transactions page
And User selects Keyboard Entry link on Issue Transactions page
And User populates the Sale Keyboard Entry page
And User selects the Submit button on Sale Keyboard Entry page
Then User is presented with Sale Payment Receipt page
And User verifies all the information is correct on Sale Payment Receipt page
And User verifies Single CF is charged on Sale Payment Receipt page



Scenario: Successful Sale Transaction with Dual CF

Given User Logs into Admin Suite
When User selects a Payment Application with Dual CF on Dashboard page
And User selects Sale link on Issue Transactions page
And User selects Keyboard Entry link on Issue Transactions page
And User populates the Sale Keyboard Entry page
And User selects the Submit button on Sale Keyboard Entry page
Then User is presented with Sale Payment Receipt page
And User verifies all the information is correct on Sale Payment Receipt page
And User verifies Dual CF is charged on Sale Payment Receipt page