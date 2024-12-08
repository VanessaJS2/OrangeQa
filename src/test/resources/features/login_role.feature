Feature: Validate entered and submitted person details
  As a Admin
  I want to validate that the entered data is properly verified
  So I can ensure the data matches the submitted forms and the status is "Hired"

  Background:
    Given  I navigate to the login page

    Scenario: Validate that the entered data is properly verified
      When I log in with valid credentials
      And I fill out the corresponding form with valid information
      Then all entered fields should be validated against the expected