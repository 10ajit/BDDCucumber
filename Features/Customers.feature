Feature: Customers

  Scenario: Successful login with valid credentials
    Given User launches Chrome browser
    When User opens the url "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And User clicks on the login button
    Then User can view Dashboard
    When User click on customer Menu
    And click on customer Menu Item
    And click on Add new button
    Then User can view add new customer page
    When User enter customer info
    And click on Save button
    Then User can view confirmation message"The new customer has been added successfully."
    And User closes the browser
    
    Scenario: Search customer by Email
    Given User launches Chrome browser
    When User opens the url "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And User clicks on the login button
    Then User can view Dashboard
    When User click on customer Menu
    And click on customer Menu Item
    And Enter customer email
    When click on search button
    Then User should found Email in the search table
    And close brouser 
    
    
    
    
    
