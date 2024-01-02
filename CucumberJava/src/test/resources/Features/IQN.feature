Feature: IQN login Page validation

  Scenario Outline: Vaidating IQN login page
    Given Brwoser is up
    And url works
    When user login with <usnm> and <pwd>
    And cicks on login button
    Then LIC homepage should be displayed

    Examples: 
      | usnm     | pwd              |
      | lpatra2  | @Ranjanpatra1990 |
      | .Lipun90 | admin123         |
