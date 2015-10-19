Feature: creating page object model
  
  Background:
  Given initiating firefox driver

  Scenario Outline: Testing gmail site logins
    When i log into gmail account "Email" as "<username>" and "Passwd" as "<password>"
    And i click on "signIn" button
    Then i check webpage title  
     
    Examples: 
      | username                     | password   |
      | chavanajayakrishna@gmail.com | Jagadeesh4 |
      | naidu.jaya1@gmail.com        | jagadeesh  |
      
  Scenario: Testing worldremit site
    Then i navigate to worldremit site
    And i passed my details
      | value                 |
      | jaikrish              |
      | chavana               |
      | naidu.jaya1@gmail.com |
      | Jagadeesh4            |
      | Jagadeesh4            |
    And i login to my worldremit Account
      | User	                     | Pass   |
      | chavanajayakrishna@gmail.com | Jagadeesh4 |
    And i click on submit button
    Then i check title of the page
    Scenario: Testing facebook webpage
    Then i navigate facebook site
    Then i pass my details
      | inspectelement | userinfo                   |
      | u_0_1          | jaikrish                   |
      | u_0_3          | chavana                    |
      | u_0_5          | jaya_krishna4145@yahoo.com |
      | u_0_8          | jaya_krishna4145@yahoo.com |
      | u_0_a          | jagadeesh4                 |
    And i click on signup button

    
