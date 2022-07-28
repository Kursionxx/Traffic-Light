Feature: Traffic Light

  Scenario: Check Colours
    Given Red light is on
    And Orange light is off
    And Green light is off

    When Click "Switch" button
    Then Red light is on
    And Orange light is on
    And wait 1 second
    Then Red light is off
    And Orange light is off
    And Green light is on

    When Click "Switch" button
    Then Orange light is on
    And Green light is off
    And wait 1 second
    Then Orange light is off
    And Red light is on
    And Green light is off
    And wait 1 second
