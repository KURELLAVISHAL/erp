$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/eclipse/erp/src/test/resources/features/Employee.feature");
formatter.feature({
  "line": 1,
  "name": "To check employee page",
  "description": "",
  "id": "to-check-employee-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9680521349,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "check employeelist employee",
  "description": "",
  "id": "to-check-employee-page;check-employeelist-employee",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@tc-4"
    },
    {
      "line": 10,
      "name": "@CI"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "login with valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "click on employee",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "check employee name is employee list",
  "keyword": "And "
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
  "duration": 15903143022,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.login_with_valid_credentials()"
});
formatter.result({
  "duration": 1608513583,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.click_on_employee()"
});
formatter.result({
  "duration": 2741256806,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.check_employee_name_is_employee_list()"
});
formatter.result({
  "duration": 2297293660,
  "status": "passed"
});
formatter.after({
  "duration": 1723345067,
  "status": "passed"
});
formatter.before({
  "duration": 5877092956,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "check search functionlality",
  "description": "",
  "id": "to-check-employee-page;check-search-functionlality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@tc-5"
    },
    {
      "line": 17,
      "name": "@CI"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "login with valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click on employee",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "enter the data in search and check whether the data is reflecting or not",
  "keyword": "And "
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
  "duration": 46835391140,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.login_with_valid_credentials()"
});
formatter.result({
  "duration": 1323198849,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.click_on_employee()"
});
formatter.result({
  "duration": 10299756947,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.enter_the_data_in_search_and_check_whether_the_data_is_reflecting_or_not()"
});
formatter.result({
  "duration": 3540755385,
  "status": "passed"
});
formatter.after({
  "duration": 1859950995,
  "status": "passed"
});
formatter.before({
  "duration": 6040408590,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "check view functionlality",
  "description": "",
  "id": "to-check-employee-page;check-view-functionlality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@tc-6"
    },
    {
      "line": 24,
      "name": "@CI"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "login with valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "click on employee",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "click view then check the details",
  "keyword": "And "
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
  "duration": 9476628958,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.login_with_valid_credentials()"
});
formatter.result({
  "duration": 30248920436,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeStepDefination.click_on_employee()"
});
formatter.result({
  "duration": 33223656728,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 30 seconds waiting for visibility of [[ChromeDriver: chrome on XP (4e8002721465bd366da1780d4f48b167)] -\u003e xpath: (//*[text()\u003d\u0027Employee\u0027])[1]]\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Lenovo-PC\u0027, ip: \u0027192.168.22.30\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:64637}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a), userDataDir\u003dC:\\Users\\Lenovo\\AppData\\Local\\Temp\\scoped_dir6096_29678}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d70.0.3538.110, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:79)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)\r\n\tat methods.ExplicitWaitMethods.waitForVisibility(ExplicitWaitMethods.java:128)\r\n\tat pages.AssociateCenterModule.clickMasterDataEmployee(AssociateCenterModule.java:169)\r\n\tat employeestepdef.EmployeeStepDefination.click_on_employee(EmployeeStepDefination.java:62)\r\n\tat ✽.Then click on employee(E:/eclipse/erp/src/test/resources/features/Employee.feature:28)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "EmployeeStepDefination.click_view_then_check_the_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("The scenario failed.");
formatter.write("Current Page URL is http://test.hff.erp.ukkoteknik.com/hff/#/hff/dashboard");
formatter.after({
  "duration": 2223897135,
  "status": "passed"
});
formatter.uri("E:/eclipse/erp/src/test/resources/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "login and logout",
  "description": "",
  "id": "login-and-logout",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5620909372,
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
      "name": "@CI"
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
  "duration": 35726994603,
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
  "duration": 5017182621,
  "error_message": "java.lang.NullPointerException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:50)\r\n\tat com.sun.proxy.$Proxy16.clear(Unknown Source)\r\n\tat com.erp.main.pagesImpl.LoginPageImpl.fillUserId(LoginPageImpl.java:47)\r\n\tat employeestepdef.LoginFeatureStepDefination.enterUserId(LoginFeatureStepDefination.java:25)\r\n\tat ✽.Then enter userid with \"accounts\"(E:/eclipse/erp/src/test/resources/features/login.feature:6)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "LoginFeatureStepDefination.clickLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginFeatureStepDefination.clickOk()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginFeatureStepDefination.clicklogout()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("The scenario failed.");
formatter.after({
  "duration": 1732996105,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "validate login fields",
  "description": "",
  "id": "login-and-logout;validate-login-fields",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@tc-2"
    },
    {
      "line": 12,
      "name": "@CI"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "navigate to \"http://test.hff.erp.ukkoteknik.com/hff/#/common/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "enter userid with \"\u003cx\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "enter password with \"\u003cy\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "validate userid and password fields with \"\u003cz\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "login-and-logout;validate-login-fields;",
  "rows": [
    {
      "cells": [
        "x",
        "y",
        "z"
      ],
      "line": 21,
      "id": "login-and-logout;validate-login-fields;;1"
    },
    {
      "cells": [
        "",
        "",
        "blank"
      ],
      "line": 22,
      "id": "login-and-logout;validate-login-fields;;2"
    },
    {
      "cells": [
        "accounts",
        "",
        "blankpwd"
      ],
      "line": 23,
      "id": "login-and-logout;validate-login-fields;;3"
    },
    {
      "cells": [
        "",
        "8f5@INV",
        "blankuserid"
      ],
      "line": 24,
      "id": "login-and-logout;validate-login-fields;;4"
    },
    {
      "cells": [
        "accounts",
        "8f5@INW",
        "invalidpwd"
      ],
      "line": 25,
      "id": "login-and-logout;validate-login-fields;;5"
    },
    {
      "cells": [
        "account",
        "8f5@INV",
        "invaliduserid"
      ],
      "line": 26,
      "id": "login-and-logout;validate-login-fields;;6"
    },
    {
      "cells": [
        "accounts",
        "8f5@INV",
        "valid"
      ],
      "line": 27,
      "id": "login-and-logout;validate-login-fields;;7"
    }
  ],
  "keyword": "Examples"
});
