#Author: your.email@your.domain.com
Feature: TvFeature
  @sanity
  Scenario: Tv
     Given user launches flipkart application
    And user able to login flipkart with credentials
     When user search tv and choose
    And user add tv to add to cart and doing payment
    Then user validate the confirmation message
  
  Scenario: Tv list
    Given user launches flipkart application
    And user able to login flipkart with credentials
    When user search tv and choose by one dimensional list
    |lg|samsung|realme|
    And user add tv to add to cart and doing payment  
    Then user validate the confirmation message
    
    Scenario: Tv map
    Given user launches flipkart application
    And user able to login flipkart with credentials
    When user search tv and choose by one dimensional map
    | tv1 | lg|
    | tv2 | realme|
    | tv3 | samsung|
    And user add mobile to add to cart and doing payment
    Then user validate the confirmation message
    
     Scenario Outline:
   Given user launches flipkart application
    And user able to login flipkart with credentials
    When user search tv and choose "<tv>"
    And user add tv to add to cart and doing payment
    Then user validate the confirmation message
    
    Examples:
    
    |tv|
    |lg|
    |samsung|
     |realme|
    
   