Feature: User Login
  As a user
  I want to login in the e-commerce website
  So that I can shop on the website

  @Smoke


  Scenario: Registered user logging in with valid username and password
    Given the user is on the login page
    When the user enter valid data
    Examples:
      | username | password |
      | standard_user    | secret_sauce  |
    Then the login will be successful
