Feature: Login Functionality

  Background:
    Given user is on landing page
    And user cliks sign in button
    Then user is navigated LoginPage

  Scenario: Sign in with No Credentials

    When sign in with no credentials
    Then There will be an error message

  Scenario: Sign in with email password empty

    When only email is entered
    Then There will be an error message1

  Scenario: Sign in with password email empty

    When only password is entered
    Then There will be an error message2

  Scenario: Sign in with Wrong Credentials

    When email and password are incorrect
    Then There will be an error message3