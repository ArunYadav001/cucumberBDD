Feature: Login
  Scenario: Successful login with valid credentials
    Given User launches a browser
    When User opens a url "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When user click on log out link
    Then Page title should be "Your store. Login"
    And  close the browser