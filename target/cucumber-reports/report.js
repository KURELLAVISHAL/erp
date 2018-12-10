$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/eclipse/erp/src/test/resources/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "login and logout",
  "description": "",
  "id": "login-and-logout",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9577414565,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Open login page and do logout",
  "description": "",
  "id": "login-and-logout;open-login-page-and-do-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tc-1"
    },
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter userid with \"accounts\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter password with \"8f5@INV\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on profile",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on logout",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://test.hff.erp.ukkoteknik.com/hff/#/common/login",
      "offset": 13
    }
  ],
  "location": "EmployeeStepDefination.navigate_to(String)"
});
formatter.result({
  "duration": 15759913453,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "accounts",
      "offset": 19
    }
  ],
  "location": "LoginFeatureStepDefination.enterUserId(String)"
});
formatter.result({
  "duration": 595729747,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8f5@INV",
      "offset": 21
    }
  ],
  "location": "LoginFeatureStepDefination.enterpwd(String)"
});
formatter.result({
  "duration": 676184540,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureStepDefination.clickLogin()"
});
formatter.result({
  "duration": 325311592,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureStepDefination.clickOk()"
});
formatter.result({
  "duration": 2124255536,
  "status": "passed"
});
formatter.match({
  "location": "LoginFeatureStepDefination.clicklogout()"
});
formatter.result({
  "duration": 1269376389,
  "status": "passed"
});
formatter.after({
  "duration": 1742124483,
  "status": "passed"
});
});