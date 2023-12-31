Feature: Testing Data Structure page of the DS algo application

  Background: The user is logged in to DS Algo portal
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/"
    And Click on Get Started
    Then Page Title should be "NumpyNinja"
    When User click on Sign in link
    Then Page Title should be "Login"
    When The user enter valid "Numpysdet84" and "sdet84batch"
    Then The user click on login button
    

  Scenario Outline: The user is able to navigate to Data Structure introduction page
    Given The user should get a message "You are logged in"
    When User click on Get Started of "<option>"
    Then Page Title should be "Data Structures-Introduction"
    

    Examples: 
      | option                       |
      | data-structures-introduction |

  Scenario Outline: The user is able to navigate to Time Complexity page
    Given The user should get a message "You are logged in"
    When User click on Get Started of "<option>"
    Then Page Title should be "Data Structures-Introduction"
    When The user clicks Time Complexity link
    Then Page Title should be "Time Complexity"
    

    Examples: 
      | option                       |
      | data-structures-introduction |

  Scenario Outline: The user is able to navigate to Try Here page
    Given The user should get a message "You are logged in"
    When User click on Get Started of "<option>"
    Then Page Title should be "Data Structures-Introduction"
    When The user clicks Time Complexity link
    Then Page Title should be "Time Complexity"
    When The user clicks Try Here button on Time Complexity page
    Then Page Title should be "Assessment"
   

    Examples: 
      | option                       |
      | data-structures-introduction |

  

    


