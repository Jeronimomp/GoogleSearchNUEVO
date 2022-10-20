Feature: I as browser in the web
  I wish to can navigate in the web and can to do search

  Scenario: Successful search
  Given that i am in the home page of Google
    When i search the word "futbol"
    Then i see the search in the list




