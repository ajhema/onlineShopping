
Scenario Outline: Add item to cart
Given I have logged in with my account
And I have searched for item <ItemName>
And I have selected first item
When I add to cart
Then the selected item is added to cart

Example:
|ItemName                   |
|samsung galaxy s10 128 GB  |
|The Alchemist by Paulo Coelho  |
