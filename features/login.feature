Feature: User Login

 Scenario: Successful login
   Given the user is on login page
   When the user enters valid credentials (username: "standard_user" , password:"secret_sauce")
   And the user clicks on Login button
   Then the user should be redirected to the My Account page
   And the user should see a welcome message