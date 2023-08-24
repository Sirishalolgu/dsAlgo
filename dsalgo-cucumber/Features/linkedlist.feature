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
  Scenario Outline: User is able to navigate to Linked list using dropdown option
    When User click on Data Structure DropDown
    And User click on "<option>"
    Then Linked List page is displayed
    When User click on topics covered with "<topic>" links
    And User click on try here button

    Examples: 
      | option      | topic                                                                                                               |
      | Linked List | Introduction,Creating Linked LIst,Types of Linked List,Implement Linked List in Python,Traversal,Insertion,Deletion |
