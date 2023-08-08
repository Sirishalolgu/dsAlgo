Feature: Testing Signin page of the DS algo application
         The User should be able to login in the application
         
  Scenario: Verifying Register link
    Given  The user is on signin page
    When The user clicks on register link on signin page
    Then The user redirected to Registration page from signin page
  
  
  Scenario Outline: User on login page and login with invalid inputs
    Given  The user is on signin page
    When  The user enter invalid "<username>" and "<password>"
    And The user click login button to verify
    Then It should display an error "Invalid Username and Password"
   Examples: 
      | username | password |
      | user     |          |
      |          | passowrd |
      |          |          |
      
      
      Scenario Outline: User enter invalid and valid inputs from Excelr on login page and login with 
    Given  The user is on signin page
    When The user enter sheet "<Sheetname>" and "<RowNumber>"
    And The user click login button to verify
    Then The User should be able to login
   Examples: 
       Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |

      
      
      
      Scenario:  Verifying signout link
    Given  The user is in the Home page with valid  log in
    When The user clicks "Sign out" 
    Then The user redirected to Home page with a message "Logged out successfully"
    