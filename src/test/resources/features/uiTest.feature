Feature: UI Test

  @UI
  Scenario: Sign in with No Credentials
    Given user is on landing page
    And user cliks sign in button
    Then user is navigated LoginPage
    When sign in with no credentials
    Then There will be an error message

  @UI
  Scenario: Sign in with email password empty
    Given user is on landing page
    And user cliks sign in button
    Then user is navigated LoginPage
    When only email is entered
    Then There will be an error message1

  @UI
  Scenario: Sign in with password email empty
    Given user is on landing page
    And user cliks sign in button
    Then user is navigated LoginPage
    When only password is entered
    Then There will be an error message2

  @UI
  Scenario: Sign in with Wrong Credentials
    Given user is on landing page
    And user cliks sign in button
    Then user is navigated LoginPage
    When email and password are incorrect
    Then There will be an error message3