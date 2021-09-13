
Feature: Search hotels

  Scenario Outline: Search hotels in destination city
    Given inititalise the "chrome" browser
    When user is on "https://www.marriott.com/default.mi" site
    And enters the <destination> city
    Then hotels should be displayed 
    And verify if "Bengaluru" is present

    Examples: 
      | destination   |
      | Banglore			|    

