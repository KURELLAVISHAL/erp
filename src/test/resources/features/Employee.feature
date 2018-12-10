Feature: To check employee page


  @tc-3  
  Scenario: create employee
    Then click on employee
    And click on add button
    Then enter all mandatory fields and click save

  @tc-4   @CI
  Scenario: check employeelist employee
   Given navigate to "http://test.hff.erp.ukkoteknik.com/hff/#/common/login"
    Then login with valid credentials
    Then click on employee
    And check employee name is employee list

  @tc-5   @CI
  Scenario: check search functionlality
   Given navigate to "http://test.hff.erp.ukkoteknik.com/hff/#/common/login"
    Then login with valid credentials
    Then click on employee
    And enter the data in search and check whether the data is reflecting or not

  @tc-6   @CI
  Scenario: check view functionlality
   Given navigate to "http://test.hff.erp.ukkoteknik.com/hff/#/common/login"
    Then login with valid credentials
    Then click on employee
    And click view then check the details
