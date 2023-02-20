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
Feature: search form sewa mobil
  I want to use this for BDD TC Rental tanpa supir

  @tag1
  Scenario Outline: Test Case search form traveloka rent car BDD tanpa supir
    Given The Traveloka Rent Car URL
    When I click button Tanpa Supir
    Then I input Lokasi Rental
    And I input Tanggal Mulai Rental
    Then I input Waktu Mulai
    And I input Tanggal Selesai
    Then I input Waktu Selesai
    And I click button Cari Mobil
    When I click Kapasitas Penumpang
    And I click Transmisi
    Then I click Tipe Mobil
    And I click Penyedia
    When I click Urutkan    
    Then Taking Screenshot Full Page

    Examples: 
      | name  | value |
      | name1 |     5 |