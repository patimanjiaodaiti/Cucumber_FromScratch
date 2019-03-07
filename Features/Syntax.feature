Feature: this is first feature
  Background: Login process
    Given browser is opened
    When website is uploaded
    And user enter username and password

  Scenario: Testing login functionality
    Then user search something using search box

  Scenario: Testing sending email functionality
    Then user click gmail

  Scenario: Test logging out
    Then user click images

  Scenario:
    Then user logs out
    # And * But does not have syntax.