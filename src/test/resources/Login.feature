@LoginPage
 # @parallel=false
Feature: Login Scenarios

  @LoginPage_Test_001
  Scenario Outline: Login with Invalid user name
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then login should fail with an error "<err>"
    Examples:
      | username | password | err |
      | invalidUsername | secret_sauce | Username and password do not match any user in this service. |

  @LoginPage_Test_002
  Scenario Outline: Login with Invalid password
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then login should fail with an error "<err>"
    Examples:
      | username | password | err |
      | standard_user | invalidPassword | Username and password do not match any user in this service. |

  @LoginPage_Test_003
  Scenario Outline: Login with valid username and password
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I login
    Then I should see products page title "<title>"
    Examples:
      | username | password | title |
      | standard_user | secret_sauce | PRODUCTS |
