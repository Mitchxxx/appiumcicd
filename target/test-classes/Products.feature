@ProductDetailsPage
#@parallel=false
Feature: Product Scenarios

  @ProductDetailsPage_Test_001
  Scenario Outline: Validate Product info on Products page
    Given I'm logged in
    Then the product is listed with title "<title>" and price "<price>"
    Examples:
      | title | price |
 #     | Sauce Labs Bolt T-Shirt | $15.99 |
 #     | Sauce Labs Onesie     | $29.99 |
      | Sauce Labs Backpack     | $29.99 |
  @ProductDetailsPage_Test_002
  Scenario Outline: Validate Product info on Products page
    Given I'm logged in
    When I click product title "<title>"
    Then I should be on product details page with title "<title>",and price "<price>" and "<description>"
    Examples:
      | title | price | description |
      | Sauce Labs Backpack     | $29.99 | carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection. |