Feature: Application login admin
Background: login to the application
Given login to the bank 

@regresstion
Scenario: Admin Page default login
    Given User is on NetBanking Landing page
    When User enters username "admi" password 134
    Then Home page should be displyed
    And cards are displyed
  @sanity
Scenario Outline: user Page default login
    Given User is on NetBanking Landing page
    When User enters username "<Username>" password <Password>
    Then Home page should be displyed
    And cards are displyed
 Examples:
   
    |Username|Password|
    |user|134|
    |hello|1345|
 @smoke   
Scenario: user Page default login
    Given User is on NetBanking Landing page
    When User enters details
    |kiran|
    |1345|
    |hyderabad|
    Then Home page should be displyed
    And cards are displyed
    