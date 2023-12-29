Feature: Testing OrangeHRM application

  Scenario Outline: To test the login functionality
    Given Browser is up and running
    And URL is available
    When user enters <uname> and <pword>
    Then user lands to the homwpage of OrangeHRM application

    Examples: 
      | uname | pword    |
      | Admin | Admin123 |
      | Admin | admin123 |
      | Admin | Admin96123 |
