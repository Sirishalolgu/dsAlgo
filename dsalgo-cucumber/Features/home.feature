Feature: Home

  Scenario: Click Register
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/"
    And Click on Get Started
    Then Page Title should be "NumpyNinja"
    When User click on Register link
    Then Page Title should be "Registration"
    And close browser

  Scenario: Click Sign In
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/"
    And Click on Get Started
    Then Page Title should be "NumpyNinja"
    When User click on Sign in link
    Then Page Title should be "Login"
    And close browser

  Scenario Outline: Click on DataStructure DropDown without login
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/"
    And Click on Get Started
    Then Page Title should be "NumpyNinja"
    When User click on Data Structure DropDown
    And User click on "<option>"
    Then The user get warning message "You are not logged in"
    And close browser

    Examples: 
      | option     |
      | Arrays     |
      | Linked List|
      | Stack      |
      | Queue      |
      | Tree       |
      | Graph      |
