Feature: Google Search

  Scenario: Searching on Google
    Given I open Google
    When I search for "OpenAI"
    Then I should see search result