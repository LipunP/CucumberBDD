Feature: Test Automation login page

  Scenario Outline: Validating test automation login screen
    Given Browser is up
    And URL is available
    When user provides <usrnm> and <psword>
    Then Homepage should be displayed

    Examples: 
      | usrnm     | psword               |
      | practice  | SuperSecretPassword! |
      | practice1 | Password123          |
      | practice  | SuperSecretPassword! |
      | practice  | SuperSecret123       |
