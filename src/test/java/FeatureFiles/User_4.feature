Feature: Add Fields and Edit and Delete
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

    Scenario:Add Fields
      Given Navigate to Fields Page
      When Create a Fields
      Then Success message should be displayed

      Scenario: Edit Fields
        Given Navigate to Fields Page
        When Edit Fields
        Then Success message should be displayed

        Scenario: Delete Fields
          Given Navigate to Fields Page
          When Delete Fields "EditUser4"
          Then Success message should be displayed