Feature: Customers

Scenario: Add a new Customer
  Given User Launch Chrome browser
  When User opnes URL "http://admin-demo.nopcommerce.com/login"
  And user enters Email as "admin@yourstore.com" and Password as "admin"
  And User click on Login
  Then User can view Dashboard
  When User click on customer Menu
  And click on customers Menu Item
  And click on Add new customer page
  When User enter customer info
  And click on Save button
  Then User can view confirmation message "The new customer has been added successfully."
  And close browser
