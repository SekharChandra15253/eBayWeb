Feature: Ebay Cart

  Scenario: Verify item can be added to cart
    Given user launches browser
    When user navigates to ebay website
    And user searches for "book"
    And user selects first product
    And user adds product to cart
    Then cart should be updated with item count