Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User Opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    When User click on Login link
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "Your store. Login"
    And close browser

#   To use data driven we use Scenario outline
  Scenario Outline: Login Data Driven
    Given User Launch Chrome browser
    When User Opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "<Email>" and Password as "<password>"
    When User click on Login link
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "Your store. Login"
    And close browser

    Examples:
      |  Email  |  password |
      | admin@yourstore.com | admin |
      | admin1@yourstore.com | admin123 |