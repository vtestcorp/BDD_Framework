Feature: Search product
This feature verifies the functionality on Search Product on onlinegrocery Website

Scenario: Check that main elements on onlinegrocery Homepage are displayed
Given I launch Chrome browser
When I open onlinegrocery  Homepage
Then I verify that the page displays search text box
When I enter search keyword
Then I verify search results are loaded
When I click on add to cart button
Then I verify that Product added to cart