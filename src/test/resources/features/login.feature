Feature: login and logout

  @tc-1   @Regression
  Scenario: Open login page and do logout
    Given navigate to "http://test.hff.erp.ukkoteknik.com/hff/#/common/login"
    Then enter userid with "accounts"
    Then enter password with "8f5@INV"
    And click on login button
    Then click on profile
    Then click on logout

  @tc-2   @Regression
  Scenario Outline: validate login fields
    Given navigate to "http://test.hff.erp.ukkoteknik.com/hff/#/common/login"
    Then enter userid with "<x>"
    Then enter password with "<y>"
    And click on login button
    Then validate userid and password fields with "<z>"

    Examples: 
      | x        | y       | z             |
      |          |         | blank         |
      | accounts |         | blankpwd      |
      |          | 8f5@INV | blankuserid   |
      | accounts | 8f5@INW | invalidpwd    |
      | account  | 8f5@INV | invaliduserid |
      | accounts | 8f5@INV | valid         |



