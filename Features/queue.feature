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
  Scenario Outline: User is able to navigate to Queue using dropdown option
  
     When User click on Data Structure DropDown
    And User click on "<option>"
      When User click on topics covered with "<topic>" links 
     And User click on try here button
     
    
    
    Examples:
   |option |topic|
   |Queue  |Implementation of Queue in Python,Implementation using collections.deque,Implementation using array,Queue Operations|
    
     