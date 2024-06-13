Feature: OrangeHRM application login test

@Regression
  Scenario Outline: Validate OrangeHRM login flow with <flow> user
    Given user in on OrangeHRM login page
    When user enters valid username as <username> in the OrangeHRM login
    And user enters valid password as <password> in the OrangeHRM login
    And user clicks on login button in the OrangeHRM login
    Then user should nagivate to required page with url having <pageName> in the OrangeHRM
    And user close the browser

    Examples: 
      | flow    | username | password | pageName  |
      | valid   | Admin    | admin123 | dashboard |
      | invalid | Admin    | admin    | login     |
      | invalid | Admin1   | admin123 | login     |
