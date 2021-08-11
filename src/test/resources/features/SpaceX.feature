# Feature to SpaceX get api feature
# Author: Gautam Deka
@Functional @API
Feature: Veify SpaceX get feature

  @SC1
  Scenario: Validate the SpaceX get request returns success response
    Given user sets the base uri for the request as "https://api.spacexdata.com"
    When user performs get request for "v4/launches/latest"
    Then validate the response code is "200"

  @SC2
  Scenario: Validate response body for few fields
    Given user sets the base uri for the request as "https://api.spacexdata.com"
    When user performs get request for "v4/launches/latest"
    Then validate the response code is "200"
    And validate that "launchpad" is set to "5e9e4501f509094ba4566f84" in the response
    And validate that "auto_update" is set to "true" in the response

  @SC3
  Scenario: Validate response for invalid get path
    Given user sets the base uri for the request as "https://api.spacexdata.com"
    When user performs get request for "v3/launches/latest"
    Then validate the response code is "404"

  @SC4
  Scenario: Validate webcast attribute value is not null
    Given user sets the base uri for the request as "https://api.spacexdata.com"
    When user performs get request for "v4/launches/latest"
    Then validate the response code is "200"
    And validate "links.webcast" value is not null
    And validate "payloads[0]" value is not null
