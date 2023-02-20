#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: search form sewa mobil dengan supir
  I want to use this for BDD TC rental dengan supir

  @tag1
  Scenario Outline: Test Case search form traveloka rental BDD dengan supir
    Given Traveloka Rent Car URL
    When I click Rent Car With Driver 
    Then I click Rental Location
    And I Input Start Date Rental
    Then I Input Start Rent Time
    And I Input Finish Date Rental
    Then I click Search Car
    When I click Filter Kapasitas Penumpang
    Then I click Filter Tipe Mobil
    #And I click Filter Penyedia
    When I click Filter Urutkan
    Then Taking Screenshot Full Pages
     
    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |