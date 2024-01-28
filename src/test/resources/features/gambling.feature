Feature:  Responsible Gambling  functionality

  @Smoke
  Scenario: User should be able to verify Responsible Gambling at the footer and navigate successfully
    Given   I am on homepage and I verify url
    And     I accept all cookies in homepage
    When    I scroll down to Responsible Gambling footer
    Then    I verify "Responsible Gambling" text
    And     I click on Responsible Gambling
    Then    I navigate to Responsible gambling page
    And     I verify the gambling text




