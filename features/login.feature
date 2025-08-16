Feature: User Login

 Scenario Outline: Login successfull
   Given the user is on login page
   When the user enters email as "<email>" and password as "<password>"
   And the user clicks on Login button
   Then the user should be redirected to the My Account page
   And the user should see a welcome message
   
   Examples:
    |email                     |  password      |
    |standard_user             | secret_sauce   |
    |locked_out_user           | secret_sauce   |
    |problem_user              | secret_sauce   |
    |performance_glitch_user   | secret_sauce   |
    	        