Feature: Testing OrangeHRM application

  Scenario: To test the login functionality
    Given Browser is up and running
    And URL is available
    When user enters uname and pword
    Then user lands to the homwpage of OrangeHRM application
