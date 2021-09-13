Feature: Member benifits page validation

  Scenario: To Verify Mobile Check-In and Mobile Key
    Given inititalise the "chrome" browser
    When user is on "https://www.marriott.com/default.mi" site
    And clicks member benifits
    Then validate the "Mobile Check-In and Mobile Key" is present