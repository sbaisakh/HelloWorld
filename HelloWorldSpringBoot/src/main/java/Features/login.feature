Feature: loginfeature
  This feature is for login feature

  Scenario: Login with correct username and password
    Given I navigate to login page
    And I enter username as admin and password as admin
    And I click login button
    Then I should see the userform page