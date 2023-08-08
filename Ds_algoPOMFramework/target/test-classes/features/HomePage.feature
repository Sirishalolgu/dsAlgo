Feature: Testing Home page of the DS algo application
         User will not be able to navigate to any data structures without login

  Scenario Outline: User is on Home page and click getstarted link on  home page without sign in
    Given The user is on Home page
    When The user clicks on Get Started link on homepage "<option>" without login
    Then The user get warning message "You are not logged in"

    Examples: 
      | option         |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |

  Scenario Outline: User is on Home page and click on dropdown without sign in
    Given The user is on Home page
    When The user clicks on dropdown "<option>" without login
    Then The user get warning message "You are not logged in"

    Examples: 
      | option         |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |

  Scenario: User is on Home page and click on sign in
    Given The user opens Home Page
    When The user clicks "Sign in"
    Then The user should be redirected to Sign in page

  Scenario: User is on Home page and click on sign in
    Given The user opens Home Page
    When The user clicks "Register"
    Then The user should be redirected to Register form
