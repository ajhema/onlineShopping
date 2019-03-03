Scenario: Go to checkout
Given I have navigated "https://www.ebay.com.au/" and logged in with my account "testjohny231@gmail.com" "pwd87451"
And I navigated to shopping cart page
When I checkout
Then I navigate to checkout page