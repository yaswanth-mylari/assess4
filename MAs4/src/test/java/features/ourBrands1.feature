
Feature: Our brands page testing

  Scenario: To Verify Jw marriot brand 
    Given inititalise the "chrome" browser
    When user is on "https://www.marriott.com/default.mi" site
    And clicks on our brands
    Then validate if "JW Marriott" is present
