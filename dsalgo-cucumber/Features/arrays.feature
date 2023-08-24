Feature: Testing the Linked list page of the Ds algo application

  Background: The user is logged in to DS Algo portal
    Given User Launch Chrome browser
    When User opens URL "https://dsportalapp.herokuapp.com/"
    And Click on Get Started
    Then Page Title should be "NumpyNinja"
    When User click on Sign in link
    Then Page Title should be "Login"
    When The user enter invalid "nehasaini09" and "cellphone_09"
    Then The user click on login button

  @pageLaunch
  Scenario Outline: User is able to navigate to Array using dropdown option
    When User click on Data Structure DropDown
    And User click on "<option>"
    Then Arrays page is displayed
    When User click on topics covered with "<topic>" links
    And User click on try here button

    Examples: 
      | option | topic                                                                              |
      | Array  | Arrays in Python,Arrays Using List,Basic Operations in Lists,Applications of Array |

  @pageLaunch
  Scenario Outline: User is able to navigate to Array next page
    When User click on Data Structure DropDown
    And User click on "<option>"
    When User clicks on pratice button
    Then new array page opens
    When click on topics covered with "<topics>"
    Then new page displayed
    

    Examples: 
      | option | topics                                                                                                   |
      | Array  | Search the array,Max Consecutive Ones,Find Numbers with Even Number of Digits,Squares of  a Sorted Array |
