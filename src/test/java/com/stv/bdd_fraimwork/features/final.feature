Feature: Final Test

  Scenario Outline: Bike page
    Given opened mainPage
    When click on the link  'Bikes' in the footer container
    Then bikes page is opened
    When hovers over the picture with the category bike
    Then inscription <arg0> appears on the picture
    And user click on the category picture
    Then category bikesPage open
    And press on the button <arg01>
    Then open all filters
    And press on the button <arg02>
    Then filters hide
    Examples:
      | arg0       | arg01          | arg02          |
      | "show now" | "more filters" | "less filters" |


