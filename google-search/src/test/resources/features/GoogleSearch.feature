Feature:
  'When I go to the Google search page, and search for an item,
  I expect to see some reference to that item in the result summary.'


  @Search
  Scenario Outline:
    Given that I have gone to the Google page
    When I add '<search_input>' to the search box
    And click the Search Button
    Then "dogs" should be mentioned in the results

    Examples:
      | search_input |
      | Duck         |
      | DUCK         |
      | duck         |