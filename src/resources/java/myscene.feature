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
#@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    When I complete action
    Then I validate the outcomes
    
@tag2    
Scenario Outline: Passing of arguments

	Given This is <username> and <password>
	When At the point when this is required
	Then It is enter in it then submitted
	
	Examples: 
	|username||password|
	|abc123||abc123|
	|xyz11||xyz11|
	|asfs||assf|
	
@tag3 
Scenario: Title of your scenario
  Given This is <username> and <password>
  |username||password|
	|abc123||abc123|
	|xyz11||xyz11|
	|asfs||assf|
	|username||password|
	When At the point when this is required
	Then It is enter in it then submitted
	