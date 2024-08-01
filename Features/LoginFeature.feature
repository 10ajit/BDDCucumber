Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given User launches Chrome browser
    When User opens the url "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And User clicks on the login button
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User clicks on the Logout link
    Then Page Title should be "Your store. Login"
    And User closes the browser
    
    
     Scenario Outline: Successful login with valid credentials DDT
     Given User launches Chrome browser
    When User opens the url "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "<email>" and Password as "<password>"
    And User clicks on the login button
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User clicks on the Logout link
    Then Page Title should be "Your store. Login"
    And User closes the browser
    
    Examples: 
    |email|password|
    |admin@yourstore.com|admin|
    |admin@yourstore.com|admin|
    
   
    
    