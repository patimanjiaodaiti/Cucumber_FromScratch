# search: Lap-top , Potato, Computer, Ipad, iphone, samsung....

Feature: Testing Multi-Datas

  @DDT
  Scenario Outline: Google Searches
    Given Environment is ready
    When got to the Website "https://www.google.com"
    And search "<SearchDatas>" keyword
    Then Close the browser

    Examples:
      | SearchDatas |
      | Lap-top   |
      | Potato    |
      | Computer  |
      | Ipad      |
      | Iphone     |
      | samsung    |



    @DDT2
    Scenario Template: Google Search2
      Given browser environment should be ready
      When got to thr Website ‘https://www.google.com/'
      And search ‘<SearchDatas1>’ keyword
      Then Close the browser

      Examples:
        | SearchDatas1 |
        | Apple    |
        | cup      |
        | cook     |
        | code     |
        | ipod     |
        | Orange   |