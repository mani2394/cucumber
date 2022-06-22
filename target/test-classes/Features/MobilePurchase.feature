#Author: mani@your.domain.com

Feature: MobilePurchase

Background:
    Given user launches flipkart application
    And user able to login flipkart with credentials
 
Scenario: Mobile
    
    When user search mobiles and choose
    And user add mobile to add to cart and doing payment
    Then user validate the confirmation message
  
 Scenario: Mobile list
    
    When user search mobiles and choose by one dimensional list
    |iphone|samsung|realme|
    And user add mobile to add to cart and doing payment  
    Then user validate the confirmation message
 
Scenario: Mobile map
   
    When user search mobiles and choose by one dimensional map
    | phone1 | iphone|
    | phone2 | realme|
    | phone3 | samsung|
    And user add mobile to add to cart and doing payment
    Then user validate the confirmation message
   
  
    
    Scenario Outline:
   
    When user search mobiles and choose "<phone>"
    And user add mobile to add to cart and doing payment
    Then user validate the confirmation message
    
    Examples:
    
    |phone|
    |iphone|
    |samsung|
     |realme|
    