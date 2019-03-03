
Scenario: Login to ebay website
Given I have navigated to homepage "https://www.ebay.com.au/"
And I landed on sign in page
When I enter username "testjohny231@gmail.com"
And I enter password "pwd87451"
And I click on sign in button
Then I am logged in with my account





