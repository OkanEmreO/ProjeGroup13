Feature: Education Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Create,Edit and Delete a Subjects Categories
    And Click on the element in the Dialog1
      | education |
      | setup    |
      | subjectCategories   |

      | addButton   |

    And User sending the keys in Dialog content1
      | nameInput   |Omer22|
      | codeInput   |1234|

    And Click on the element in the Dialog1
      | saveButton   |
    And User sending the keys in Dialog content1
      | searchInput   |Omer22|

    And Click on the element in the Dialog1
      | searchButton  |
      | deleteButton  |
      |deleteDialogBtn|
    And Success message should be displayed