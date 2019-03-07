@tag
Feature: google search
  Scenario: should be able to do google search
    Then go to the "https://www.google.com"
    Then search when "MacBook pro"